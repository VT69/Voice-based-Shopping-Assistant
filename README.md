# Voice Command Shopping Assistant

A voice-driven application that helps users manage their shopping list, search for products, and get smart recommendations based on purchase history.

## Prerequisites
- Java 21
- Node.js 20+
- Docker

## Setup Steps
1. Start the database:
   ```bash
   docker compose up -d
   ```
2. Start the backend:
   ```bash
   cd backend
   mvn spring-boot:run
   ```
3. Start the frontend:
   ```bash
   cd frontend
   npm install
   npm run dev
   ```

## Design Notes
The application enforces a strict LLM-boundary principle: the LLM (Large Language Model) is strictly used to parse transcript text into a structured `CommandIntent` DTO. The LLM never touches the database directly, and all routing and business logic is handled by the application's domain services.
