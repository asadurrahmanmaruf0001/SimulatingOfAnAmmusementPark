package OOPProject.Maruf;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BookRestaurantTableController
{
    @javafx.fxml.FXML
    private TextField numberOfPeopleField;
    @javafx.fxml.FXML
    private DatePicker reservationDatePick;
    @javafx.fxml.FXML
    private Label bookingStatus;
    @javafx.fxml.FXML
    private ComboBox<String> restaurantCombo;
    @javafx.fxml.FXML
    private TextField reservationTimeField;

    @javafx.fxml.FXML
    public void initialize() {
        restaurantCombo.getItems().addAll("sunset Dine","Ocean Breeze","Mountain View Cafe");
    }

    @javafx.fxml.FXML
    public void checkAvailabilityButton(ActionEvent actionEvent) {
        String restaurant= restaurantCombo.getValue();
        String date =reservationDatePick.getValue().toString();
        String time= reservationTimeField.getText();
        String people = numberOfPeopleField.getText();
        if (restaurant == null || date.isEmpty()){
            bookingStatus.setText("Please fill in the these fields given to you");
            return;
        }
        if (restaurant.equals("Sunset Dine")&& time.equals("1:00")){
            bookingStatus.setText("No tables are available at this time.Please pick another time");

        }
        else{
            bookingStatus.setText("Table booked successfully for "+ people + "People at"+ restaurant +"on"+ date + "at" + time + ".");
        }
    }
}