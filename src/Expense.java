public class Expense {

    // Expense data
    private String title;
    private double amount;
    private String category;
    private String date;

    // Constructor
    public Expense(String title, double amount, String category, String date) {

        this.title = title;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    // Get title
    public String getTitle() {
        return title;
    }

    // Set title
    public void setTitle(String title) {
        this.title = title;
    }

    // Get amount
    public double getAmount() {
        return amount;
    }

    // Set amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Get category
    public String getCategory() {
        return category;
    }

    // Set category
    public void setCategory(String category) {
        this.category = category;
    }

    // Get date
    public String getDate() {
        return date;
    }

    // Set date
    public void setDate(String date) {
        this.date = date;
    }
}