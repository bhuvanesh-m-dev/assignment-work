# WEB TECHNOLOGIES

## Servlet & JDBC Web Application Collection

> **A practical collection of four Java Servlet-based web applications demonstrating form handling, server-side processing, authentication, arithmetic operations, JDBC connectivity, MySQL database operations and CRUD functionality.**

---

## 📌 Project Overview

This repository contains the complete implementation of a **Web Technologies assignment series** developed using **Java Servlets, HTML, JDBC and MySQL**.

Instead of treating each assignment as an isolated program, the four assignments have been organized into a single structured project containing four independent web applications.

### The Four Applications

| No. | Application                      | Main Concept            |
| :-: | -------------------------------- | ----------------------- |
|  01 | 👨‍💼 Employee Management System | CRUD Operations + JDBC  |
|  02 | 🧮 Arithmetic Calculator         | Servlet Form Processing |
|  03 | 🔐 Login System                  | Credential Validation   |
|  04 | 🎓 Student Registration System   | JDBC + MySQL            |

---

# 🎯 Assignment Objectives

The project was developed to implement the following Web Technologies requirements:

### 01 — Employee Management System

Create a Servlet-based Employee Management System with:

* Add operation
* Update operation
* Delete operation
* Display operation
* JDBC database connectivity

### 02 — Arithmetic Calculator

Develop a Servlet that receives two numbers from an HTML form and performs:

* Addition
* Subtraction
* Multiplication
* Division

### 03 — Login Servlet

Create a Login Servlet that:

* Accepts username and password
* Validates credentials
* Displays an appropriate success message
* Displays an appropriate failure message

### 04 — Student Registration System

Develop a Servlet and JDBC-based Student Registration System that:

* Accepts student details
* Inserts student records into MySQL
* Retrieves student records
* Displays registered students

---

# 🧩 Project Modules

## 01 — Employee Management System

### Overview

The Employee Management System is a Servlet and JDBC-based CRUD application for managing employee records.

### Employee Information

```text
Employee ID
Employee Name
Department
Salary
```

### Operations

```text
ADD
 ↓
INSERT INTO DATABASE

DISPLAY
 ↓
SELECT FROM DATABASE

UPDATE
 ↓
MODIFY DATABASE RECORD

DELETE
 ↓
REMOVE DATABASE RECORD
```

### Architecture

```text
Employee HTML Form
        ↓
Employee Servlet
        ↓
       JDBC
        ↓
      MySQL
        ↓
 Employee Records
        ↓
    Web Response
```

### Technologies Used

`HTML` `Java Servlet` `JDBC` `MySQL` `Apache Tomcat`

📂 **Project Folder:**
[`01-Employee-Management-System`](./01-Employee-Management-System/)

---

# 🧮 02 — Arithmetic Calculator

### Overview

The Arithmetic Calculator is a simple Servlet-based application that receives two numbers through an HTML form and performs the selected mathematical operation.

### Supported Operations

```text
Addition
Subtraction
Multiplication
Division
```

### Working

```text
Number 1
   +
Number 2
   ↓
HTML Form
   ↓
Calculator Servlet
   ↓
Selected Operation
   ↓
Calculated Result
```

### Example

```text
Input:

Number 1 = 20
Number 2 = 10

Operation = Addition

Output:

Result = 30
```

### Technologies Used

`HTML` `Java` `Servlet` `Apache Tomcat`

📂 **Project Folder:**
[`02-Arithmetic-Calculator`](./02-Arithmetic-Calculator/)

---

# 🔐 03 — Login System

### Overview

The Login System is a basic Servlet-based authentication demonstration.

The application accepts a username and password through an HTML form and validates the submitted credentials.

### Working

```text
Username
    +
Password
    ↓
Login HTML Form
    ↓
Login Servlet
    ↓
Credential Validation
    ↓
 ┌───────────────┐
 │               │
 ▼               ▼
SUCCESS        FAILURE
 │               │
 ▼               ▼
Welcome       Invalid
Message       Credentials
```

### Demonstration Credentials

```text
Username: admin
Password: 12345
```

> This credential setup is intended only for academic demonstration. Production authentication systems should use secure password storage, hashing and database-backed authentication.

### Technologies Used

`HTML` `Java Servlet` `Apache Tomcat`

📂 **Project Folder:**
[`03-Login-System`](./03-Login-System/)

---

# 🎓 04 — Student Registration System

### Overview

The Student Registration System is a Servlet and JDBC-based database application for registering and retrieving student information.

### Student Information

```text
Roll Number
Name
Department
Email
Phone
```

### Working

```text
Student Registration Form
          ↓
    Student Servlet
          ↓
         JDBC
          ↓
        MySQL
          ↓
    Student Table
          ↓
     Retrieve Records
          ↓
      Display Result
```

### Database Operations

```text
INSERT
  ↓
Register Student

SELECT
  ↓
Retrieve Students
```

### Technologies Used

`HTML` `Java Servlet` `JDBC` `MySQL` `Apache Tomcat`

📂 **Project Folder:**
[`04-Student-Registration-System`](./04-Student-Registration-System/)

---

# 🏗️ System Architecture

The complete project follows a simple client-server architecture.

```text
                    USER
                      │
                      ▼
                HTML WEB FORMS
                      │
                      ▼
                HTTP REQUEST
                      │
                      ▼
                JAVA SERVLETS
                      │
             ┌────────┴────────┐
             │                 │
             ▼                 ▼
        APPLICATION          JDBC
           LOGIC               │
             │                 ▼
             │              MYSQL
             │                 │
             │        ┌────────┴────────┐
             │        │                 │
             │        ▼                 ▼
             │    EMPLOYEE          STUDENT
             │     TABLE             TABLE
             │        │                 │
             └────────┴─────────────────┘
                      │
                      ▼
                HTTP RESPONSE
                      │
                      ▼
                     USER
```

---

# 🔄 Application Flow

The common request-processing flow used throughout the project is:

```text
USER INPUT
    ↓
HTML FORM
    ↓
HTTP POST / GET REQUEST
    ↓
JAVA SERVLET
    ↓
PROCESS INPUT
    ↓
JDBC / APPLICATION LOGIC
    ↓
MYSQL DATABASE
    ↓
GENERATE RESPONSE
    ↓
DISPLAY RESULT
```

---

# 🛠️ Technology Stack

| Technology        | Purpose                        |
| ----------------- | ------------------------------ |
| **HTML5**         | User interface and forms       |
| **Java**          | Application programming        |
| **Java Servlet**  | Server-side request processing |
| **JDBC**          | Java-to-database connectivity  |
| **MySQL**         | Data storage                   |
| **Apache Tomcat** | Servlet execution environment  |
| **Git**           | Version control                |
| **GitHub**        | Source code hosting            |

---

# 🗄️ Database Design

Two applications use MySQL databases.

## Employee Database

### Database

```text
employee_db
```

### Table

```text
employee
```

### Columns

| Column       | Type    | Description     |
| ------------ | ------- | --------------- |
| `id`         | INT     | Employee ID     |
| `name`       | VARCHAR | Employee Name   |
| `department` | VARCHAR | Department      |
| `salary`     | DOUBLE  | Employee Salary |

---

## Student Database

### Database

```text
student_db
```

### Table

```text
student
```

### Columns

| Column       | Type    | Description         |
| ------------ | ------- | ------------------- |
| `rollno`     | INT     | Student Roll Number |
| `name`       | VARCHAR | Student Name        |
| `department` | VARCHAR | Department          |
| `email`      | VARCHAR | Email Address       |
| `phone`      | VARCHAR | Phone Number        |

---

# 📁 Repository Structure

```text
web-technologies-servlet-projects/
│
├── README.md
├── LICENSE
│
├── 01-Employee-Management-System/
│   ├── README.md
│   ├── src/
│   │   └── EmployeeServlet.java
│   ├── web/
│   │   ├── index.html
│   │   └── WEB-INF/
│   │       └── web.xml
│   └── database/
│       └── employee.sql
│
├── 02-Arithmetic-Calculator/
│   ├── README.md
│   ├── src/
│   │   └── CalculatorServlet.java
│   └── web/
│       ├── calculator.html
│       └── WEB-INF/
│           └── web.xml
│
├── 03-Login-System/
│   ├── README.md
│   ├── src/
│   │   └── LoginServlet.java
│   └── web/
│       ├── login.html
│       └── WEB-INF/
│           └── web.xml
│
├── 04-Student-Registration-System/
│   ├── README.md
│   ├── src/
│   │   └── StudentServlet.java
│   ├── web/
│   │   ├── student.html
│   │   └── WEB-INF/
│   │       └── web.xml
│   └── database/
│       └── student.sql
│
└── screenshots/
    ├── employee-management.png
    ├── calculator.png
    ├── login.png
    └── student-registration.png
```

---

# ⚙️ Requirements

Before running the applications, install:

### Software

* JDK
* Apache Tomcat
* MySQL Server
* MySQL Connector/J
* Eclipse / IntelliJ IDEA / VS Code

### Recommended Environment

```text
Java JDK
        +
Apache Tomcat 10+
        +
MySQL
        +
MySQL Connector/J
```

---

# 🚀 How to Run

## Step 1 — Clone the Repository

```bash
git clone <YOUR_GITHUB_REPOSITORY_URL>
```

Move into the project directory:

```bash
cd web-technologies-servlet-projects
```

---

## Step 2 — Configure MySQL

Open the SQL files:

```text
01-Employee-Management-System/database/employee.sql
04-Student-Registration-System/database/student.sql
```

Run them in MySQL.

This creates:

```text
employee_db
student_db
```

and the corresponding tables.

---

# 🔌 Step 3 — Configure JDBC

Update the database configuration inside the respective Servlets.

Example:

```java
private static final String URL =
    "jdbc:mysql://localhost:3306/employee_db";

private static final String USER =
    "root";

private static final String PASSWORD =
    "YOUR_MYSQL_PASSWORD";
```

For the Student project:

```java
private static final String URL =
    "jdbc:mysql://localhost:3306/student_db";
```

> Never commit your real database password to GitHub.

---

# 🐱 Step 4 — Configure Apache Tomcat

Deploy the Servlet applications using Apache Tomcat.

The projects use the **Jakarta Servlet API** and are intended for modern Tomcat versions such as Tomcat 10+.

The servlet mappings are defined in:

```text
WEB-INF/web.xml
```

---

# ▶️ Step 5 — Run the Applications

After deploying the applications, open the corresponding HTML pages through the Tomcat server.

Example application paths:

```text
/01-Employee-Management-System
/02-Arithmetic-Calculator
/03-Login-System
/04-Student-Registration-System
```

The exact URL depends on the deployment context configured in Tomcat.

---

# 🧪 Testing

Each application was tested using multiple input scenarios.

## Employee Management

Tested operations:

```text
✓ Add Employee
✓ Display Employees
✓ Update Employee
✓ Delete Employee
```

## Calculator

Tested operations:

```text
✓ Addition
✓ Subtraction
✓ Multiplication
✓ Division
✓ Division-by-zero handling
```

## Login

Tested:

```text
✓ Valid Credentials
✓ Invalid Username
✓ Invalid Password
```

## Student Registration

Tested:

```text
✓ Student Registration
✓ Database Insertion
✓ Student Retrieval
✓ Record Display
```

---

# 📸 Screenshots

Project screenshots are maintained in the `screenshots` directory.

### Employee Management

![Employee Management](./screenshots/employee-management.png)

### Arithmetic Calculator

![Arithmetic Calculator](./screenshots/calculator.png)

### Login System

![Login System](./screenshots/login.png)

### Student Registration

![Student Registration](./screenshots/student-registration.png)

---

# 📚 Concepts Demonstrated

This project demonstrates the following Web Technologies concepts:

```text
HTML FORMS
     ↓
HTTP REQUESTS
     ↓
JAVA SERVLETS
     ↓
REQUEST PROCESSING
     ↓
JDBC
     ↓
SQL
     ↓
MYSQL
     ↓
HTTP RESPONSE
```

### Core Concepts

* HTML form creation
* Form data submission
* HTTP GET requests
* HTTP POST requests
* Servlet lifecycle
* Request parameter handling
* Response generation
* JDBC connectivity
* SQL queries
* CRUD operations
* Database insertion
* Database retrieval
* Input validation
* Exception handling
* Web application deployment

---

# 🎓 Learning Outcomes

After completing this project, the following practical skills were demonstrated:

### Web Development

Understanding how HTML forms communicate with server-side Java applications.

### Servlet Programming

Understanding how Java Servlets receive requests, process data and generate responses.

### Database Programming

Using JDBC to establish communication between Java applications and MySQL.

### CRUD Operations

Implementing:

```text
CREATE
READ
UPDATE
DELETE
```

### Application Integration

Combining frontend forms, backend Java logic and database operations into functional web applications.

---

# 🔐 Security Note

The Login application in this project is designed for **academic demonstration**.

The credentials are intentionally simple and hard-coded.

A production-ready authentication system should implement:

* Database-backed authentication
* Password hashing
* Session management
* Input sanitization
* Secure credential storage
* HTTPS
* Proper authorization

Similarly, database credentials should never be committed directly to a public repository.

---

# 🌐 Project Documentation

A visual project showcase and additional documentation are available online:

**Project Documentation:**
`https://bhuvanesh-m-dev.github.io/assignment-work/web-technologies-3`

The documentation provides a visual overview of the completed Web Technologies work and project modules.

---

# 📂 Individual Project Documentation

Each project contains its own README with implementation-specific information.

### Employee Management System

[Open Project README](./01-Employee-Management-System/README.md)

### Arithmetic Calculator

[Open Project README](./02-Arithmetic-Calculator/README.md)

### Login System

[Open Project README](./03-Login-System/README.md)

### Student Registration System

[Open Project README](./04-Student-Registration-System/README.md)

---

# 💡 Project Highlights

```text
┌─────────────────────────────────────┐
│       WEB TECHNOLOGIES PROJECT      │
├─────────────────────────────────────┤
│                                     │
│  👨‍💼 Employee Management            │
│       CRUD + JDBC + MySQL           │
│                                     │
│  🧮 Arithmetic Calculator           │
│       Servlet + HTML Forms          │
│                                     │
│  🔐 Login System                    │
│       Servlet + Validation          │
│                                     │
│  🎓 Student Registration            │
│       Servlet + JDBC + MySQL        │
│                                     │
└─────────────────────────────────────┘
```

---

# 📈 Project Flow

The complete learning progression represented by this repository is:

```text
HTML FORMS
     ↓
SERVLET REQUEST HANDLING
     ↓
SERVER-SIDE PROCESSING
     ↓
INPUT VALIDATION
     ↓
JDBC CONNECTIVITY
     ↓
SQL OPERATIONS
     ↓
CRUD
     ↓
DATABASE-DRIVEN WEB APPLICATION
```

---

# 🔮 Future Enhancements

The applications can be extended with:

* Responsive modern UI
* Database-based login authentication
* Password hashing
* Session management
* Search and filtering
* Pagination
* Form validation
* REST APIs
* MVC architecture
* Connection pooling
* Role-based access control
* Deployment on a cloud Java server

---

# 📜 Academic Context

This repository was created as a practical implementation of **Web Technologies** coursework.

The project focuses on understanding the fundamentals of:

**HTML + Java Servlet + JDBC + MySQL**

and demonstrates how these technologies can be combined to create functional server-side web applications.

---

# 👨‍💻 Author

## Bhuvanesh M

**Web Technologies Project**

```text
Java
Servlet
JDBC
MySQL
HTML
Apache Tomcat
```

---

# 📌 Project Status

**✅ Completed**

Four Web Technologies applications have been implemented and organized into a single structured repository.

---

## ⭐ Summary

This project transforms four individual Web Technologies assignments into a structured collection of practical Java web applications.

```text
EMPLOYEE MANAGEMENT
        +
ARITHMETIC CALCULATOR
        +
LOGIN SYSTEM
        +
STUDENT REGISTRATION
        ↓
WEB TECHNOLOGIES
SERVLET & JDBC PROJECT
```

**Built with Java Servlets • JDBC • MySQL • HTML • Apache Tomcat**
