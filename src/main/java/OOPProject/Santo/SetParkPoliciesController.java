package OOPProject.Santo;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SetParkPoliciesController {

    @FXML
    private TextField policyTitleField;
    @FXML
    private TextArea policyContentArea;
    @FXML
    private TextArea validationMessagesArea;

    @FXML
    private void handleSavePolicy() {
        String title = policyTitleField.getText();
        String content = policyContentArea.getText();
        validationMessagesArea.clear();

        // Validate that all required fields are filled
        if (title.isEmpty() || content.isEmpty()) {
            validationMessagesArea.setText("Error: All fields must be filled out.");
            return;
        }

        // Logic to save the policy in the database (placeholder)
        // For example: savePolicyToDatabase(title, content);

        validationMessagesArea.setText("Policy saved successfully!");
    }
}
