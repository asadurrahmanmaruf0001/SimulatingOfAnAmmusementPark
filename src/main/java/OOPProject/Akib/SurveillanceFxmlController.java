package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import OOPProject.Akib.SurveillanceModel;

import java.time.LocalDate;
import java.util.ArrayList;

public class SurveillanceFxmlController {
    @javafx.fxml.FXML
    private ImageView camera2ImageView;
    @javafx.fxml.FXML
    private ComboBox<String> cameraSelectComboBox;
    @javafx.fxml.FXML
    private DatePicker playBackDatePicker;
    @javafx.fxml.FXML
    private ImageView camera1ImageView;
    @javafx.fxml.FXML
    private ImageView camera3ImageView;
    @javafx.fxml.FXML
    private Label messageLabel;

    ArrayList<SurveillanceModel> accessLog = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        cameraSelectComboBox.getItems().addAll("Camera 1", "Camera 2", "Camera 3");



    }


    @javafx.fxml.FXML
    public void playRecordingButtonOnAction(ActionEvent actionEvent) {
        String selectedCamera = cameraSelectComboBox.getValue();
        LocalDate selectedDate = playBackDatePicker.getValue();

        if (selectedCamera == null || selectedDate == null) {
            messageLabel.setText("Please select a camera and playback date.");
            return;
        }


        String currentUser = "Security Officer";
        SurveillanceModel log = new SurveillanceModel(selectedCamera, selectedDate, currentUser);
        accessLog.add(log);

        messageLabel.setText("Recording " + selectedCamera + " on " + selectedDate);
    }
}

