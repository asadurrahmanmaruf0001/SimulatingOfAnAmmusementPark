package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class SurveillanceFxmlController {
    @javafx.fxml.FXML
    private ImageView camera2ImageView;
    @javafx.fxml.FXML
    private ComboBox cameraSelectComboBox;
    @javafx.fxml.FXML
    private DatePicker playBackDatePicker;
    @javafx.fxml.FXML
    private ImageView camera1ImageView;
    @javafx.fxml.FXML
    private ImageView camera3ImageView;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void playRecordingButtonOnAction(ActionEvent actionEvent) {
    }
}
