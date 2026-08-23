import React, { useState } from 'react';
// import { sendCommand } from '../api/client'; // TODO: Call backend API

// Component purpose: Capture voice input using SpeechRecognition, display transcript, and send to backend
const VoiceInput = () => {
    const [transcript, setTranscript] = useState('');
    const [isListening, setIsListening] = useState(false);

    const toggleListening = () => {
        const SpeechRecognition = window.SpeechRecognition || window.webkitSpeechRecognition;
        if (!SpeechRecognition) {
            console.error('Speech recognition not supported in this browser.');
            return;
        }

        const recognition = new SpeechRecognition();
        
        if (isListening) {
            recognition.stop();
            setIsListening(false);
            return;
        }

        recognition.onresult = (event) => {
            const currentTranscript = event.results[0][0].transcript;
            setTranscript(currentTranscript);
            console.log("Recognized:", currentTranscript);
            // TODO: sendCommand(currentTranscript)
        };
        
        recognition.onend = () => {
            setIsListening(false);
        };

        recognition.start();
        setIsListening(true);
    };

    return (
        <div>
            <h2>Voice Input</h2>
            <button onClick={toggleListening}>
                {isListening ? 'Stop Listening' : 'Start Listening'}
            </button>
            <p>Transcript: {transcript}</p>
        </div>
    );
};

export default VoiceInput;
