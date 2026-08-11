import java.util.Scanner;

public class ExpenseTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Maximum number of expenses
        int maxExpenses = 100;

        // Arrays to store expense details
        String[] titles = new String[maxExpenses];
        double[] amounts = new double[maxExpenses];
        String[] categories = new String[maxExpenses];
        String[] dates = new String[maxExpenses];

        // Number of expenses currently stored
        int expenseCount = 0;

        int choice = 0;

        while (choice != 6) {

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
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            // =========================
            // ADD EXPENSE
            // =========================

            if (choice == 1) {

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

                } else {

                    System.out.println("Expense storage is full!");
                }
            }

            // =========================
            // VIEW ALL EXPENSES
            // =========================

            else if (choice == 2) {

                if (expenseCount == 0) {

                    System.out.println();
                    System.out.println("No expenses found.");

                } else {

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

            else if (choice == 3) {

                if (expenseCount == 0) {

                    System.out.println();
                    System.out.println("No expenses found.");

                } else {

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

                    } else {

                        System.out.println();
                        System.out.println("Invalid expense number!");
                    }
                }
            }

            // =========================
            // DELETE EXPENSE
            // =========================

            else if (choice == 4) {

                if (expenseCount == 0) {

                    System.out.println();
                    System.out.println("No expenses found.");

                } else {

                    System.out.print("Enter expense number to delete: ");

                    int expenseNumber = input.nextInt();

                    int index = expenseNumber - 1;

                    if (index >= 0 && index < expenseCount) {

                        // Move the next expenses one position backwards
                        for (int i = index; i < expenseCount - 1; i++) {

                            titles[i] = titles[i + 1];
                            amounts[i] = amounts[i + 1];
                            categories[i] = categories[i + 1];
                            dates[i] = dates[i + 1];
                        }

                        expenseCount--;

                        System.out.println();
                        System.out.println("Expense deleted successfully!");

                    } else {

                        System.out.println();
                        System.out.println("Invalid expense number!");
                    }
                }
            }

            // =========================
            // TOTAL EXPENSES
            // =========================

            else if (choice == 5) {

                double total = 0;

                for (int i = 0; i < expenseCount; i++) {

                    total = total + amounts[i];
                }

                System.out.println();
                System.out.println("==============================");
                System.out.println("Total Expenses: Rs." + total);
                System.out.println("==============================");
            }

            // =========================
            // EXIT
            // =========================

            else if (choice == 6) {

                System.out.println();
                System.out.println("Thank you for using Expense Tracker!");

            }

            // =========================
            // INVALID CHOICE
            // =========================

            else {

                System.out.println();
                System.out.println("Invalid choice!");
            }
        }

        input.close();
    }
}