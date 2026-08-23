CREATE DATABASE IF NOT EXISTS employee_db;

USE employee_db;

CREATE TABLE IF NOT EXISTS employee (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(100) NOT NULL,
    salary DOUBLE NOT NULL
);

INSERT INTO employee
(id, name, department, salary)
VALUES
(101, 'Arun', 'Computer Science', 45000),
(102, 'Priya', 'Human Resources', 40000);
