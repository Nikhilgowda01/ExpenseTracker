import java.util.List;
import java.util.Scanner;

public class ExpenseTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ExpenseDAO expenseDAO = new ExpenseDAO();

        int choice = 0;

        while (choice != 6) {

            System.out.println();
            System.out.println("================================");
            System.out.println("        EXPENSE TRACKER");
            System.out.println("================================");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Modify Expense");
            System.out.println("4. Delete Expense");
            System.out.println("5. Total Expense");
            System.out.println("6. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            // ADD
            if (choice == 1) {

                System.out.println();
                System.out.println("---------- ADD EXPENSE ----------");

                System.out.print("Enter expense title: ");
                String title = input.nextLine();

                System.out.print("Enter amount: ");
                double amount = input.nextDouble();
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

                expenseDAO.addExpense(expense);
            }

            // VIEW
            else if (choice == 2) {

                System.out.println();
                System.out.println("---------- ALL EXPENSES ----------");

                List<Expense> expenses = expenseDAO.getAllExpenses();

                if (expenses.isEmpty()) {

                    System.out.println("No expenses found.");

                } else {

                    for (Expense expense : expenses) {

                        System.out.println();
                        System.out.println("ID       : " + expense.getId());
                        System.out.println("Title    : " + expense.getTitle());
                        System.out.println("Amount   : Rs." + expense.getAmount());
                        System.out.println("Category : " + expense.getCategory());
                        System.out.println("Date     : " + expense.getExpenseDate());
                        System.out.println("--------------------------------");
                    }
                }
            }

            // MODIFY
            else if (choice == 3) {

                System.out.println();
                System.out.println("---------- MODIFY EXPENSE ----------");

                System.out.print("Enter expense ID: ");
                int id = input.nextInt();
                input.nextLine();

                Expense existingExpense = expenseDAO.getExpenseById(id);

                if (existingExpense == null) {

                    System.out.println("Expense not found.");

                } else {

                    System.out.print("Enter new title: ");
                    String title = input.nextLine();

                    System.out.print("Enter new amount: ");
                    double amount = input.nextDouble();
                    input.nextLine();

                    System.out.print("Enter new category: ");
                    String category = input.nextLine();

                    System.out.print("Enter new date: ");
                    String date = input.nextLine();

                    existingExpense.setTitle(title);
                    existingExpense.setAmount(amount);
                    existingExpense.setCategory(category);
                    existingExpense.setExpenseDate(date);

                    expenseDAO.updateExpense(existingExpense);
                }
            }

            // DELETE
            else if (choice == 4) {

                System.out.println();
                System.out.println("---------- DELETE EXPENSE ----------");

                System.out.print("Enter expense ID: ");
                int id = input.nextInt();
                input.nextLine();

                expenseDAO.deleteExpense(id);
            }

            // TOTAL
            else if (choice == 5) {

                System.out.println();
                System.out.println("---------- TOTAL EXPENSE ----------");

                double total = expenseDAO.getTotalExpense();

                System.out.println("Total Expense: Rs." + total);
            }

            // EXIT
            else if (choice == 6) {

                System.out.println();
                System.out.println("Thank you for using Expense Tracker!");

            }

            // INVALID
            else {

                System.out.println();
                System.out.println("Invalid choice!");
            }
        }

        input.close();

        DatabaseConnection.closeCleanupThread();
    }
}