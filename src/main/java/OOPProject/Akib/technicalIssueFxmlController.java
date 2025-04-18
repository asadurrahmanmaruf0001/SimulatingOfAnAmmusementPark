package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import OOPProject.Akib.technicalIssueModel;

import java.util.ArrayList;

public class technicalIssueFxmlController {
    @javafx.fxml.FXML
    private TextField areaInvolvedTextField;
    @javafx.fxml.FXML
    private TextArea descriptionFieldTextArea;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> priorityComboBox;

    ArrayList<technicalIssueModel> issues = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        priorityComboBox.getItems().addAll("Low", "Medium", "High");
    }

    @javafx.fxml.FXML
    public void assignButtonOnAction(ActionEvent actionEvent) {
        String description = descriptionFieldTextArea.getText();
        String area = areaInvolvedTextField.getText();
        String priority = priorityComboBox.getValue();

        if (description.isEmpty() || area.isEmpty() || priority == null) {
            messageLabel.setText("Please fill all required fields.");
        } else {
            technicalIssueModel issue = new technicalIssueModel(description, area, priority);
            issues.add(issue);

            messageLabel.setText("Technical issue assigned successfully.");

            descriptionFieldTextArea.clear();
            areaInvolvedTextField.clear();
            priorityComboBox.setValue(null);
        }

    }
}
