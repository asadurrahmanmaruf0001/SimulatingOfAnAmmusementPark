package OOPProject.Santo;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.time.LocalDateTime;

public class MonitorRideSafetyController {

    @FXML
    private TextArea safetyIndicatorsArea;
    @FXML
    private TextArea issueReportArea;
    @FXML
    private TextArea safetyLogArea;

    @FXML
    private void handleCheckIndicators() {
        // Logic to check safety indicators (placeholder)
        safetyIndicatorsArea.setText("All systems operational. No alerts.");
    }

    @FXML
    private void handleReportIssue() {
        String issue = issueReportArea.getText();
        if (issue.isEmpty()) {
            safetyLogArea.appendText("No issue reported.\n");
            return;
        }

        LocalDateTime reportTime = LocalDateTime.now();
        safetyLogArea.appendText("Reported issue at " + reportTime + ": " + issue + "\n");

        // Logic to notify the Park Admin (placeholder)
        issueReportArea.clear();
    }
}
