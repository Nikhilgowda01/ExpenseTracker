# Expense Tracker 💰

A simple Java console application for managing personal expenses.

I started this project while learning Java and have been improving it step by step as I learn new concepts. The current version can store expenses in a file, so the data is not lost when the program is closed.

## What it can do

- Add an expense
- View all expenses
- Modify an expense
- Delete an expense
- Calculate total expenses
- Save expenses to a file
- Load saved expenses when the program starts
- Handle invalid user input

## Technologies

- Java
- VS Code
- Git
- GitHub

## Project Structure

```text
ExpenseTracker/
│
├── src/
│   ├── Expense.java
│   └── ExpenseTracker.java
│
├── data/
│   └── expenses.txt
│
└── README.md
```

## How it works

Each expense contains four pieces of information:

```text
Title
Amount
Category
Date
```

For example:

```text
Title    : Java Book
Amount   : Rs.500
Category : Education
Date     : 16/08/2026
```

The expenses are stored in an `ArrayList` while the program is running.

When an expense is added, modified, or deleted, the program saves the current data to `expenses.txt`.

When the program starts again, it reads the file and loads the saved expenses.

## Menu

```text
==============================
       EXPENSE TRACKER
==============================

1. Add Expense
2. View All Expenses
3. Modify Expense
4. Delete Expense
5. Total Expenses
6. Exit
```

## File Storage

The application currently uses a simple text file for storage.

Example:

```text
Book|300.0|Study|16/08/2026
Lunch|150.0|Food|16/08/2026
Bus|50.0|Travel|16/08/2026
```

The `|` symbol is used to separate the different pieces of information.

## Java Concepts Used

Through the different versions of this project, I have used:

- Variables and data types
- Operators
- Conditional statements
- `while` and `for` loops
- Arrays
- Methods
- Classes and objects
- Constructors
- Encapsulation
- Getters and setters
- `ArrayList`
- `Scanner`
- Exception handling
- Input validation
- File handling
- `FileReader`
- `FileWriter`
- `BufferedReader`
- `BufferedWriter`

## How to Run

Clone the repository:

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

Open the project in VS Code.

Compile the Java files:

```bash
javac src\Expense.java src\ExpenseTracker.java
```

Run the application:

```bash
java -cp src ExpenseTracker
```

## Current Version

**Version 6**

The main improvement in this version is file storage. Expenses are now saved to `expenses.txt` and loaded again when the application starts.

## Author

**Nikhil**

This project is part of my Java learning journey. I am building and improving it as I learn new Java concepts.