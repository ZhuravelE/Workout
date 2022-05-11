CREATE DATABASE hibernate_example_1 ENCODING 'UTF-8';

CREATE TABLE IF NOT EXISTS engines (
    id SERIAL PRIMARY KEY,
    model VARCHAR(25) NOT NULL,
    power INTEGER NOT NULL
);

INSERT INTO engines (id, model, power) VALUES (DEFAULT, 'engine_model_01', 1250);
INSERT INTO engines (id, model, power) VALUES (DEFAULT, 'engine_model_02', 2820);
