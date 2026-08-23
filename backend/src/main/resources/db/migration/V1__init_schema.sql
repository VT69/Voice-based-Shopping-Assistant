CREATE EXTENSION IF NOT EXISTS pg_trgm;

CREATE TABLE IF NOT EXISTS users (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    language VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS products (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(255),
    brand VARCHAR(255),
    price DECIMAL(10, 2),
    unit VARCHAR(50),
    in_stock BOOLEAN,
    season VARCHAR(50),
    substitute_group VARCHAR(255)
);

CREATE INDEX IF NOT EXISTS trgm_idx_products_name ON products USING gin (name gin_trgm_ops);

CREATE TABLE IF NOT EXISTS shopping_list_items (
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL REFERENCES users(id),
    product_id BIGINT NOT NULL REFERENCES products(id),
    quantity INTEGER,
    unit VARCHAR(50),
    status VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS purchase_history (
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL REFERENCES users(id),
    product_id BIGINT NOT NULL REFERENCES products(id),
    quantity INTEGER,
    purchased_at TIMESTAMP
);

CREATE TABLE IF NOT EXISTS co_occurrence_seed (
    item_a BIGINT NOT NULL REFERENCES products(id),
    item_b BIGINT NOT NULL REFERENCES products(id),
    weight DECIMAL(10, 2),
    PRIMARY KEY (item_a, item_b)
);

-- Seed Data
INSERT INTO users (name, language) VALUES ('Test User', 'en') ON CONFLICT DO NOTHING;

INSERT INTO products (name, category, brand, price, unit, in_stock, season, substitute_group) VALUES 
('Organic Milk', 'Dairy', 'FarmFresh', 3.99, 'Gallon', true, 'All', 'Milk'),
('Almond Milk', 'Dairy', 'NutriFarm', 4.49, 'Gallon', true, 'All', 'Milk'),
('Whole Wheat Bread', 'Bakery', 'HealthyOven', 2.99, 'Loaf', true, 'All', 'Bread'),
('Bananas', 'Produce', 'TropicalBest', 1.29, 'lb', true, 'All', 'Fruit'),
('Apples', 'Produce', 'OrchardFresh', 2.49, 'lb', true, 'Autumn', 'Fruit'),
('Chicken Breast', 'Meat', 'PoultryFarm', 5.99, 'lb', true, 'All', 'Meat'),
('Eggs', 'Dairy', 'FarmFresh', 2.49, 'Dozen', true, 'All', 'Eggs'),
('Orange Juice', 'Beverages', 'CitrusCo', 4.99, 'Carton', true, 'All', 'Juice'),
('Coffee Beans', 'Beverages', 'RoastMaster', 12.99, 'lb', true, 'All', 'Coffee'),
('Pasta', 'Pantry', 'Italiano', 1.99, 'Box', true, 'All', 'Pasta')
ON CONFLICT DO NOTHING;
