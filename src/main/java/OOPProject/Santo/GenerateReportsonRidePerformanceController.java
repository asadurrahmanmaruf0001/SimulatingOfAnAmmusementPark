package OOPProject.Santo;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class GenerateReportsonRidePerformanceController {

    @FXML
    private TextArea reportArea;
    @FXML
    private TextArea statusArea;

    @FXML
    private void handleGenerateAttendanceReport() {
        // Logic to generate daily attendance report (placeholder)
        String report = "Daily Attendance Report:\n" +
                "Total Visitors: 500\n" +
                "Ride Usage:\n" +
                "Roller Coaster: 200\n" +
                "Ferris Wheel: 150\n" +
                "Carousel: 150\n";

        reportArea.setText(report);
        statusArea.setText("Attendance report generated successfully.");
    }

    @FXML
    private void handleGenerateRevenueReport() {
        // Logic to generate revenue report (placeholder)
        String report = "Revenue Report:\n" +
                "Total Ticket Sales: $5000\n" +
                "Total Concessions: $1500\n" +
                "Total Revenue: $6500\n";

        reportArea.setText(report);
        statusArea.setText("Revenue report generated successfully.");
    }

    @FXML
    private void handleSaveReport() {
        // Logic to save the report data to the database (placeholder)
        // For example: saveReportToDatabase(reportArea.getText());

        statusArea.setText("Report saved successfully to the database.");
    }
}