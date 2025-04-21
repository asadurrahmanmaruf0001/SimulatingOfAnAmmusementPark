package OOPProject.Santo;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDateTime;

public class AssistGuestsController {

    @FXML
    private TextField guestNameField;
    @FXML
    private TextArea safetyInstructionsArea;
    @FXML
    private TextArea guestQuestionsArea;
    @FXML
    private TextArea interactionLogArea;

    @FXML
    private void handleProvideInstructions() {
        String guestName = guestNameField.getText();
        String instructions = "Welcome " + guestName + "! Please ensure your seatbelt is fastened and follow all safety protocols.";
        safetyInstructionsArea.setText(instructions);

        // Log the interaction
        LocalDateTime interactionTime = LocalDateTime.now();
        interactionLogArea.appendText("Provided instructions to " + guestName + " at " + interactionTime + ".\n");
    }

    @FXML
    private void handleAnswerQuestions() {
        String questions = guestQuestionsArea.getText();
        if (questions.isEmpty()) {
            interactionLogArea.appendText("No questions to answer.\n");
            return;
        }

        // Logic to address questions (placeholder)
        LocalDateTime answerTime = LocalDateTime.now();
        interactionLogArea.appendText("Answered questions from guest at " + answerTime + ": " + questions + "\n");
    }
}