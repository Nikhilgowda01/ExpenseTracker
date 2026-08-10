import java.util.Scanner;

public class ExpenseTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String title = "";
        double amount = 0;
        String category = "";
        String date = "";

        boolean expenseExists = false;

        int choice = 0;

        while (choice != 5) {

            System.out.println();
            System.out.println("==============================");
            System.out.println("       EXPENSE TRACKER");
            System.out.println("==============================");

            System.out.println("1. Add Expense");
            System.out.println("2. View Expense");
            System.out.println("3. Modify Expense");
            System.out.println("4. Delete Expense");
            System.out.println("5. Exit");

            System.out.println();
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            // ADD EXPENSE
            if (choice == 1) {

                input.nextLine();

                System.out.print("Enter expense title: ");
                title = input.nextLine();

                System.out.print("Enter amount: ");
                amount = input.nextDouble();

                input.nextLine();

                System.out.print("Enter category: ");
                category = input.nextLine();

                System.out.print("Enter date: ");
                date = input.nextLine();

                expenseExists = true;

                System.out.println();
                System.out.println("Expense added successfully!");
            }

            // VIEW EXPENSE
            else if (choice == 2) {

                if (expenseExists == true) {

                    System.out.println();
                    System.out.println("========== EXPENSE ==========");

                    System.out.println("Title    : " + title);
                    System.out.println("Amount   : Rs." + amount);
                    System.out.println("Category : " + category);
                    System.out.println("Date     : " + date);

                    System.out.println("=============================");

                } else {

                    System.out.println();
                    System.out.println("No expense found.");
                }
            }

            // MODIFY EXPENSE
            else if (choice == 3) {

                if (expenseExists == true) {

                    input.nextLine();

                    System.out.print("Enter new title: ");
                    title = input.nextLine();

                    System.out.print("Enter new amount: ");
                    amount = input.nextDouble();

                    input.nextLine();

                    System.out.print("Enter new category: ");
                    category = input.nextLine();

                    System.out.print("Enter new date: ");
                    date = input.nextLine();

                    System.out.println();
                    System.out.println("Expense modified successfully!");

                } else {

                    System.out.println();
                    System.out.println("No expense found to modify.");
                }
            }

            // DELETE EXPENSE
            else if (choice == 4) {

                if (expenseExists == true) {

                    title = "";
                    amount = 0;
                    category = "";
                    date = "";

                    expenseExists = false;

                    System.out.println();
                    System.out.println("Expense deleted successfully!");

                } else {

                    System.out.println();
                    System.out.println("No expense found to delete.");
                }
            }

            // EXIT
            else if (choice == 5) {

                System.out.println();
                System.out.println("Thank you for using Expense Tracker!");

            }

            // INVALID CHOICE
            else {

                System.out.println();
                System.out.println("Invalid choice!");
            }
        }

        input.close();
    }
}