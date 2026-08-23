import React from 'react'
import VoiceInput from './components/VoiceInput'
import ShoppingList from './components/ShoppingList'
import SuggestionPanel from './components/SuggestionPanel'
import ProductSearch from './components/ProductSearch'
import LanguageSelector from './components/LanguageSelector'

function App() {
  return (
    <div>
      <header>
        <h1>Voice Command Shopping Assistant</h1>
        <LanguageSelector />
      </header>
      
      <main>
        <section>
          <VoiceInput />
        </section>

        <section style={{ display: 'flex', gap: '2rem' }}>
          <div>
            <ShoppingList />
          </div>
          <div>
            <SuggestionPanel />
            <ProductSearch />
          </div>
        </section>
      </main>
    </div>
  )
}

export default App
