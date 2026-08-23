CREATE DATABASE IF NOT EXISTS student_db;

USE student_db;

CREATE TABLE IF NOT EXISTS student (
    rollno INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone VARCHAR(15) NOT NULL
);

INSERT INTO student
(rollno, name, department, email, phone)
VALUES
(101, 'Bhuvanesh', 'Computer Science and Engineering',
 'bhuvanesh@example.com', '9876543210'),

(102, 'Arun', 'Information Technology',
 'arun@example.com', '9876543211');
