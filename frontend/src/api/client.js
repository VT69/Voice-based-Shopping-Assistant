const API_BASE = 'http://localhost:8080/api';

export const sendCommand = async (text) => {
    const response = await fetch(`${API_BASE}/commands`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ text })
    });
    return response.json();
};

export const getShoppingList = async () => {
    const response = await fetch(`${API_BASE}/shopping-list`);
    return response.json();
};

export const removeShoppingListItem = async (id) => {
    const response = await fetch(`${API_BASE}/shopping-list/${id}`, {
        method: 'DELETE'
    });
    if (!response.ok) {
        throw new Error('Failed to delete item');
    }
};

export const searchProducts = async (query, maxPrice, brand) => {
    const response = await fetch(`${API_BASE}/products/search`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ query, maxPrice, brand })
    });
    return response.json();
};

export const getSuggestions = async () => {
    const response = await fetch(`${API_BASE}/suggestions`);
    return response.json();
};
