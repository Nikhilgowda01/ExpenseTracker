# Expense Tracker 💰

A simple **Java console-based Expense Tracker** project.

This project is being developed step-by-step while learning Java programming and applying each new concept to a practical project.

## 📌 Project Overview

The Expense Tracker allows users to manage multiple expenses through a simple console menu.

Users can:

- Add expenses
- View all expenses
- Modify an expense
- Delete an expense
- Calculate total expenses
- Exit the application

## 🛠️ Technologies Used

- Java
- VS Code
- Git
- GitHub

## 📂 Project Structure

```text
ExpenseTracker/
│
├── src/
│   └── ExpenseTracker.java
│
└── README.md
```

## ✨ Features

### 1. Add Expense

The user can enter:

- Expense title
- Amount
- Category
- Date

Example:

```text
Enter expense title: Book
Enter amount: 300
Enter category: Study
Enter date: 13/08/2026

Expense added successfully!
```

### 2. View All Expenses

The application displays all stored expenses.

Example:

```text
========== ALL EXPENSES ==========

Expense 1
Title    : Book
Amount   : Rs.300.0
Category : Study
Date     : 13/08/2026
----------------------------------

Expense 2
Title    : Lunch
Amount   : Rs.150.0
Category : Food
Date     : 13/08/2026
----------------------------------
```

### 3. Modify Expense

The user can select an expense number and modify its:

- Title
- Amount
- Category
- Date

### 4. Delete Expense

The user can select an expense number and delete it.

### 5. Total Expenses

The application calculates and displays the total amount of all stored expenses.

Example:

```text
==============================
Total Expenses: Rs.450.0
==============================
```

### 6. Exit

The user can exit the application by selecting option `6`.

## 🎯 Current Version

### Version 3

Current version supports:

- [x] Add multiple expenses
- [x] View all expenses
- [x] Modify expense
- [x] Delete expense
- [x] Calculate total expenses
- [x] Repeating menu using `while` loop
- [x] Arrays
- [x] `for` loop
- [x] Methods
- [x] Separate methods for different operations

## 📚 Java Concepts Used

This project currently uses:

- Variables
- Data Types
- Operators
- `if`
- `else if`
- `else`
- `while` loop
- `for` loop
- Arrays
- Array indexing
- Methods
- `Scanner`
- Boolean values
- User input
- String handling

## 🔧 Methods Used

The program is divided into separate methods to make the code easier to understand and maintain.

```text
main()
│
├── showMenu()
├── addExpense()
├── viewExpenses()
├── modifyExpense()
├── deleteExpense()
└── calculateTotal()
```

## ▶️ How to Run

### Step 1: Clone the Repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

### Step 2: Open the Project

Open the project in VS Code.

### Step 3: Open the Source Folder

```text
src/ExpenseTracker.java
```

### Step 4: Compile

Open the terminal and run:

```bash
cd src
javac ExpenseTracker.java
```

### Step 5: Run

```bash
java ExpenseTracker
```

## 🖥️ Application Menu

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

Enter your choice:
```

## 👨‍💻 Author

**Nikhil**

This project is created as part of my Java learning journey and is being developed step-by-step as I learn new Java concepts.

## 📄 License

This project is for learning and educational purposes.