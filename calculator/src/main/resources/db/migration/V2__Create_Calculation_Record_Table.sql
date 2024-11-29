CREATE TABLE calculation_record (
    id SERIAL PRIMARY KEY,
    firstNumber VARCHAR(255),
    firstBase INT,
    secondNumber VARCHAR(255),
    secondBase INT,
    operation VARCHAR(50),
    resultBase INT,
    result VARCHAR(255),
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);