# Expense Tracker 💰

A console-based Expense Tracker built using Java.

I started this project while learning Java and improved it step by step. In this version, the application is connected to MySQL using JDBC, so expenses are stored permanently in a database.

## Features

- Add Expense
- View Expenses
- Modify Expense
- Delete Expense
- Calculate Total Expense
- Exit
- Store expenses in MySQL
- Basic input validation

## Technologies Used

- Java
- JDBC
- MySQL
- Maven
- VS Code
- Git
- GitHub

## Project Structure

```text
ExpenseTracker/
│
├── src/
│   └── main/
│       └── java/
│           ├── DatabaseConnection.java
│           ├── Expense.java
│           ├── ExpenseDAO.java
│           └── ExpenseTracker.java
│
├── .gitignore
├── pom.xml
└── README.md
```

## How It Works

The application follows this flow:

```text
User
 ↓
ExpenseTracker
 ↓
ExpenseDAO
 ↓
JDBC
 ↓
MySQL
```

### Expense.java

Represents an expense and stores its details:

- ID
- Title
- Amount
- Category
- Date

### DatabaseConnection.java

Creates the connection between Java and MySQL.

### ExpenseDAO.java

Handles database operations:

- INSERT
- SELECT
- UPDATE
- DELETE
- SUM

### ExpenseTracker.java

Handles:

- Menu
- User input
- Program flow
- Displaying results

## Database

The project uses a MySQL database called:

```text
expense_tracker
```

The main table is:

```text
expenses
```

Table structure:

```text
expenses
├── id
├── title
├── amount
├── category
└── expense_date
```

## Application Menu

```text
================================
        EXPENSE TRACKER
================================
1. Add Expense
2. View Expenses
3. Modify Expense
4. Delete Expense
5. Total Expense
6. Exit
================================
Enter your choice:
```

## Example

Adding an expense:

```text
Enter your choice: 1

---------- ADD EXPENSE ----------
Enter expense title: Java Book
Enter amount: 500
Enter category: Education
Enter date: 18/08/2026

Expense added successfully!
```

Viewing expenses:

```text
---------- ALL EXPENSES ----------

ID       : 1
Title    : Java Book
Amount   : Rs.500.0
Category : Education
Date     : 18/08/2026
--------------------------------
```

## Database Setup

Create the database:

```sql
CREATE DATABASE expense_tracker;
```

Select the database:

```sql
USE expense_tracker;
```

Create the table:

```sql
CREATE TABLE expenses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    amount DOUBLE NOT NULL,
    category VARCHAR(50) NOT NULL,
    expense_date VARCHAR(20) NOT NULL
);
```

## Running the Project

Make sure Java, Maven and MySQL are installed.

From the project directory:

```bash
mvn clean compile
```

Then run:

```bash
mvn exec:java
```

## JDBC

This project uses JDBC to connect Java with MySQL.

The main JDBC classes used are:

- Connection
- DriverManager
- PreparedStatement
- ResultSet

## Java Concepts Used

This project helped me practice:

- Variables
- Data types
- Operators
- Conditional statements
- Loops
- Methods
- Classes and objects
- Constructors
- Encapsulation
- Getters and setters
- ArrayList
- Scanner
- Exception handling
- Input validation
- JDBC
- SQL
- MySQL
- Maven
- DAO pattern

## Current Version

### Version 7

The application now uses MySQL for permanent expense storage through JDBC.

Previously, expenses were stored locally. Now the data is stored in a real database and remains available after the application is closed.

## Author

**Nikhil**

This project is part of my Java learning journey. I am building it step by step while learning new Java concepts. 