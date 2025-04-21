package OOPProject.Maruf;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import javax.swing.text.html.ImageView;
import java.awt.*;

public class ViewParkMapConreoller
{
    @javafx.fxml.FXML
    private TextArea directionTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> desinyCombo;

    @javafx.fxml.FXML
    public void initialize() {
        desinyCombo.getItems().addAll("Restaurant","Toilet","ride","Ticket counter","Entry gate","Exit");

    }

    @javafx.fxml.FXML
    public void showRouteOnAc(ActionEvent actionEvent) {
        String destination = desinyCombo.getValue();
        if (destination == null){
            directionTextArea.setText("Please select a location to view direction");
            return;
        }
        directionTextArea.setText(("Your current position is near entry gate"));
    }
}