package OOPProject.Maruf;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SubmitFeedbackController
{
    @javafx.fxml.FXML
    private TextArea feedbackTextArea;
    @javafx.fxml.FXML
    private Label feedbackMessageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> ratingComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        ratingComboBox.getItems().addAll("1","2","3","4","5");
    }

    @javafx.fxml.FXML
    public void btnSubmitFeedback(ActionEvent actionEvent) {
        String rating = ratingComboBox.getValue();
        String comment= feedbackTextArea.getText();
        if(rating != null && comment.isEmpty()){
            feedbackMessageLabel.setText("Thank You");

        }else{
            feedbackMessageLabel.setText("Please complete all fields before submitting");
        }
    }
}