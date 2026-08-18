import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDAO {

    // ADD EXPENSE
    public void addExpense(Expense expense) {

        String sql = "INSERT INTO expenses (title, amount, category, expense_date) VALUES (?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, expense.getTitle());
            statement.setDouble(2, expense.getAmount());
            statement.setString(3, expense.getCategory());
            statement.setString(4, expense.getExpenseDate());

            statement.executeUpdate();

            System.out.println();
            System.out.println("Expense added successfully!");

        } catch (SQLException e) {
            System.out.println("Error adding expense: " + e.getMessage());
        }
    }


    // VIEW ALL EXPENSES
    public List<Expense> getAllExpenses() {

        List<Expense> expenses = new ArrayList<>();

        String sql = "SELECT * FROM expenses";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                double amount = resultSet.getDouble("amount");
                String category = resultSet.getString("category");
                String expenseDate = resultSet.getString("expense_date");

                Expense expense = new Expense(
                        id,
                        title,
                        amount,
                        category,
                        expenseDate
                );

                expenses.add(expense);
            }

        } catch (SQLException e) {
            System.out.println("Error viewing expenses: " + e.getMessage());
        }

        return expenses;
    }


    // FIND EXPENSE BY ID
    public Expense getExpenseById(int id) {

        String sql = "SELECT * FROM expenses WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {

                if (resultSet.next()) {

                    return new Expense(
                            resultSet.getInt("id"),
                            resultSet.getString("title"),
                            resultSet.getDouble("amount"),
                            resultSet.getString("category"),
                            resultSet.getString("expense_date")
                    );
                }
            }

        } catch (SQLException e) {
            System.out.println("Error finding expense: " + e.getMessage());
        }

        return null;
    }


    // MODIFY EXPENSE
    public void updateExpense(Expense expense) {

        String sql = """
                UPDATE expenses
                SET title = ?, amount = ?, category = ?, expense_date = ?
                WHERE id = ?
                """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, expense.getTitle());
            statement.setDouble(2, expense.getAmount());
            statement.setString(3, expense.getCategory());
            statement.setString(4, expense.getExpenseDate());
            statement.setInt(5, expense.getId());

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Expense modified successfully!");
            } else {
                System.out.println("Expense not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error modifying expense: " + e.getMessage());
        }
    }


    // DELETE EXPENSE
    public void deleteExpense(int id) {

        String sql = "DELETE FROM expenses WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Expense deleted successfully!");
            } else {
                System.out.println("Expense not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error deleting expense: " + e.getMessage());
        }
    }


    // TOTAL EXPENSE
    public double getTotalExpense() {

        String sql = "SELECT SUM(amount) AS total FROM expenses";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {

                double total = resultSet.getDouble("total");

                return total;
            }

        } catch (SQLException e) {
            System.out.println("Error calculating total: " + e.getMessage());
        }

        return 0;
    }
}