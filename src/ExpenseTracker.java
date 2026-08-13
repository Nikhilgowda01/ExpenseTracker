import java.util.Scanner;

public class ExpenseTracker {

    static Scanner input = new Scanner(System.in);

    static int maxExpenses = 100;

    static String[] titles = new String[maxExpenses];
    static double[] amounts = new double[maxExpenses];
    static String[] categories = new String[maxExpenses];
    static String[] dates = new String[maxExpenses];

    static int expenseCount = 0;


    // =========================
    // MAIN METHOD
    // =========================

    public static void main(String[] args) {

        int choice = 0;

        while (choice != 6) {

            showMenu();

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
                System.out.println("Thank you for using Expense Tracker!");

            }

            else {

                System.out.println();
                System.out.println("Invalid choice!");

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

        if (expenseCount < maxExpenses) {

            input.nextLine();

            System.out.print("Enter expense title: ");
            titles[expenseCount] = input.nextLine();

            System.out.print("Enter amount: ");
            amounts[expenseCount] = input.nextDouble();

            input.nextLine();

            System.out.print("Enter category: ");
            categories[expenseCount] = input.nextLine();

            System.out.print("Enter date: ");
            dates[expenseCount] = input.nextLine();

            expenseCount++;

            System.out.println();
            System.out.println("Expense added successfully!");

        }

        else {

            System.out.println();
            System.out.println("Expense storage is full!");

        }
    }


    // =========================
    // VIEW EXPENSES
    // =========================

    static void viewExpenses() {

        if (expenseCount == 0) {

            System.out.println();
            System.out.println("No expenses found.");

        }

        else {

            System.out.println();
            System.out.println("========== ALL EXPENSES ==========");

            for (int i = 0; i < expenseCount; i++) {

                System.out.println();
                System.out.println("Expense " + (i + 1));

                System.out.println("Title    : " + titles[i]);
                System.out.println("Amount   : Rs." + amounts[i]);
                System.out.println("Category : " + categories[i]);
                System.out.println("Date     : " + dates[i]);

                System.out.println("----------------------------------");
            }
        }
    }


    // =========================
    // MODIFY EXPENSE
    // =========================

    static void modifyExpense() {

        if (expenseCount == 0) {

            System.out.println();
            System.out.println("No expenses found.");

        }

        else {

            System.out.print("Enter expense number to modify: ");

            int expenseNumber = input.nextInt();

            int index = expenseNumber - 1;

            if (index >= 0 && index < expenseCount) {

                input.nextLine();

                System.out.print("Enter new title: ");
                titles[index] = input.nextLine();

                System.out.print("Enter new amount: ");
                amounts[index] = input.nextDouble();

                input.nextLine();

                System.out.print("Enter new category: ");
                categories[index] = input.nextLine();

                System.out.print("Enter new date: ");
                dates[index] = input.nextLine();

                System.out.println();
                System.out.println("Expense modified successfully!");

            }

            else {

                System.out.println();
                System.out.println("Invalid expense number!");

            }
        }
    }


    // =========================
    // DELETE EXPENSE
    // =========================

    static void deleteExpense() {

        if (expenseCount == 0) {

            System.out.println();
            System.out.println("No expenses found.");

        }

        else {

            System.out.print("Enter expense number to delete: ");

            int expenseNumber = input.nextInt();

            int index = expenseNumber - 1;

            if (index >= 0 && index < expenseCount) {

                for (int i = index; i < expenseCount - 1; i++) {

                    titles[i] = titles[i + 1];

                    amounts[i] = amounts[i + 1];

                    categories[i] = categories[i + 1];

                    dates[i] = dates[i + 1];
                }

                expenseCount--;

                System.out.println();
                System.out.println("Expense deleted successfully!");

            }

            else {

                System.out.println();
                System.out.println("Invalid expense number!");

            }
        }
    }


    // =========================
    // CALCULATE TOTAL
    // =========================

    static void calculateTotal() {

        double total = 0;

        for (int i = 0; i < expenseCount; i++) {

            total = total + amounts[i];

        }

        System.out.println();
        System.out.println("==============================");
        System.out.println("Total Expenses: Rs." + total);
        System.out.println("==============================");
    }
}