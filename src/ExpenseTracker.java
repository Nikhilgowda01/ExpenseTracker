import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpenseTracker {

    static Scanner input = new Scanner(System.in);

    static ArrayList<Expense> expenses = new ArrayList<>();


    // =========================
    // MAIN METHOD
    // =========================

    public static void main(String[] args) {

        int choice = 0;

        while (choice != 6) {

            showMenu();

            try {

                System.out.print("Enter your choice: ");
                choice = input.nextInt();

                if (choice == 1) {

                    addExpense();

                }

                else if (choice == 2) {

                    viewExpenses();

                }

                else if (choice == 3) {

                    modifyExpense();

                }

                else if (choice == 4) {

                    deleteExpense();

                }

                else if (choice == 5) {

                    calculateTotal();

                }

                else if (choice == 6) {

                    System.out.println();
                    System.out.println(
                        "Thank you for using Expense Tracker!"
                    );

                }

                else {

                    System.out.println();
                    System.out.println("Invalid choice!");
                }

            }

            catch (InputMismatchException e) {

                System.out.println();
                System.out.println(
                    "Invalid input! Please enter a number."
                );

                input.nextLine();
            }
        }

        input.close();
    }


    // =========================
    // SHOW MENU
    // =========================

    static void showMenu() {

        System.out.println();
        System.out.println("==============================");
        System.out.println("       EXPENSE TRACKER");
        System.out.println("==============================");

        System.out.println("1. Add Expense");
        System.out.println("2. View All Expenses");
        System.out.println("3. Modify Expense");
        System.out.println("4. Delete Expense");
        System.out.println("5. Total Expenses");
        System.out.println("6. Exit");

        System.out.println();
    }


    // =========================
    // ADD EXPENSE
    // =========================

    static void addExpense() {

        input.nextLine();

        System.out.print("Enter expense title: ");
        String title = input.nextLine();

        double amount;

        while (true) {

            try {

                System.out.print("Enter amount: ");
                amount = input.nextDouble();

                if (amount < 0) {

                    System.out.println(
                        "Amount cannot be negative."
                    );

                }

                else {

                    break;
                }

            }

            catch (InputMismatchException e) {

                System.out.println(
                    "Invalid amount! Please enter a number."
                );

                input.nextLine();
            }
        }

        input.nextLine();

        System.out.print("Enter category: ");
        String category = input.nextLine();

        System.out.print("Enter date: ");
        String date = input.nextLine();

        Expense expense = new Expense(
            title,
            amount,
            category,
            date
        );

        expenses.add(expense);

        System.out.println();
        System.out.println("Expense added successfully!");
    }


    // =========================
    // VIEW EXPENSES
    // =========================

    static void viewExpenses() {

        if (expenses.isEmpty()) {

            System.out.println();
            System.out.println("No expenses found.");

            return;
        }

        System.out.println();
        System.out.println("========== ALL EXPENSES ==========");

        for (int i = 0; i < expenses.size(); i++) {

            Expense expense = expenses.get(i);

            System.out.println();
            System.out.println("Expense " + (i + 1));

            System.out.println(
                "Title    : " + expense.getTitle()
            );

            System.out.println(
                "Amount   : Rs." + expense.getAmount()
            );

            System.out.println(
                "Category : " + expense.getCategory()
            );

            System.out.println(
                "Date     : " + expense.getDate()
            );

            System.out.println(
                "----------------------------------"
            );
        }
    }


    // =========================
    // MODIFY EXPENSE
    // =========================

    static void modifyExpense() {

        if (expenses.isEmpty()) {

            System.out.println();
            System.out.println("No expenses found.");

            return;
        }

        int expenseNumber;

        while (true) {

            try {

                System.out.print(
                    "Enter expense number to modify: "
                );

                expenseNumber = input.nextInt();

                break;

            }

            catch (InputMismatchException e) {

                System.out.println(
                    "Invalid input! Please enter a number."
                );

                input.nextLine();
            }
        }

        int index = expenseNumber - 1;

        if (index >= 0 && index < expenses.size()) {

            Expense expense = expenses.get(index);

            input.nextLine();

            System.out.print("Enter new title: ");
            String title = input.nextLine();

            double amount;

            while (true) {

                try {

                    System.out.print("Enter new amount: ");
                    amount = input.nextDouble();

                    if (amount < 0) {

                        System.out.println(
                            "Amount cannot be negative."
                        );

                    }

                    else {

                        break;
                    }

                }

                catch (InputMismatchException e) {

                    System.out.println(
                        "Invalid amount! Please enter a number."
                    );

                    input.nextLine();
                }
            }

            input.nextLine();

            System.out.print("Enter new category: ");
            String category = input.nextLine();

            System.out.print("Enter new date: ");
            String date = input.nextLine();

            expense.setTitle(title);
            expense.setAmount(amount);
            expense.setCategory(category);
            expense.setDate(date);

            System.out.println();
            System.out.println(
                "Expense modified successfully!"
            );

        }

        else {

            System.out.println();
            System.out.println(
                "Invalid expense number!"
            );
        }
    }


    // =========================
    // DELETE EXPENSE
    // =========================

    static void deleteExpense() {

        if (expenses.isEmpty()) {

            System.out.println();
            System.out.println("No expenses found.");

            return;
        }

        int expenseNumber;

        while (true) {

            try {

                System.out.print(
                    "Enter expense number to delete: "
                );

                expenseNumber = input.nextInt();

                break;

            }

            catch (InputMismatchException e) {

                System.out.println(
                    "Invalid input! Please enter a number."
                );

                input.nextLine();
            }
        }

        int index = expenseNumber - 1;

        if (index >= 0 && index < expenses.size()) {

            expenses.remove(index);

            System.out.println();
            System.out.println(
                "Expense deleted successfully!"
            );

        }

        else {

            System.out.println();
            System.out.println(
                "Invalid expense number!"
            );
        }
    }


    // =========================
    // CALCULATE TOTAL
    // =========================

    static void calculateTotal() {

        double total = 0;

        for (int i = 0; i < expenses.size(); i++) {

            total = total + expenses.get(i).getAmount();
        }

        System.out.println();
        System.out.println("==============================");
        System.out.println(
            "Total Expenses: Rs." + total
        );
        System.out.println("==============================");
    }
}