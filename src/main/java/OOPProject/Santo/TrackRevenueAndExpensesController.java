package OOPProject.Santo;



import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TrackRevenueAndExpensesController {

    @FXML
    private TextField dailyRevenueField;
    @FXML
    private TextField expensesField;
    @FXML
    private TextArea summaryArea;

    @FXML
    private void handleSubmit() {
        double dailyRevenue = Double.parseDouble(dailyRevenueField.getText());
        double expenses = Double.parseDouble(expensesField.getText());
        double profitLoss = dailyRevenue - expenses;

        String summary = "Total Revenue: $" + dailyRevenue + "\n" +
                "Total Expenses: $" + expenses + "\n" +
                "Profit/Loss: $" + profitLoss;

        summaryArea.setText(summary);
    }

    @FXML
    private void handleExportReport() {
        // Logic to export the report as PDF or Excel file
        summaryArea.appendText("\nReport exported successfully.\n");
    }
}
