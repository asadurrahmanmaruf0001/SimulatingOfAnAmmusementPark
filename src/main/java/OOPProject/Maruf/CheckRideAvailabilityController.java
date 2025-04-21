package OOPProject.Maruf;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class CheckRideAvailabilityController
{
    @javafx.fxml.FXML
    private TextArea rideDetailArea;
    @javafx.fxml.FXML
    private TableColumn <com.example.demo2.Maruf.Ride,String>statusCol;
    @javafx.fxml.FXML
    private TableColumn<com.example.demo2.Maruf.Ride,String> rideNameCol;
    @javafx.fxml.FXML
    private TableColumn<com.example.demo2.Maruf.Ride,String> waitTimeCol;
    @javafx.fxml.FXML
    private TableView<com.example.demo2.Maruf.Ride> RideTableView;

    @javafx.fxml.FXML
    public void initialize() {
        rideNameCol.setCellValueFactory(new PropertyValueFactory<>("rideName"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        waitTimeCol.setCellValueFactory(new PropertyValueFactory<>("waitTime"));
        com.example.demo2.Maruf.Ride r1 = new com.example.demo2.Maruf.Ride("Magic carpet", "Open", 10);
        com.example.demo2.Maruf.Ride r2 = new com.example.demo2.Maruf.Ride("splash water", "Open", 4);
        com.example.demo2.Maruf.Ride r3 = new com.example.demo2.Maruf.Ride("Thunder Coaster", "Open", 10);
        com.example.demo2.Maruf.Ride r4 = new com.example.demo2.Maruf.Ride("Sky wheel", "Open", 5);
        RideTableView.getItems().add(r1);
        RideTableView.getItems().add(r2);
        RideTableView.getItems().add(r3);
        RideTableView.getItems().add(r4);
        com.example.demo2.Maruf.Ride selectedRide= RideTableView.getSelectionModel().getSelectedItem();
        if(selectedRide != null) {
            String details = "Ride Name:" + selectedRide.getRideName() + "\n" + "Status:" + selectedRide.getStatus() + "\n" + "Wait time:" + selectedRide.getWaitTime();
            rideDetailArea.setText(details);
        }else{
            rideDetailArea.setText("Please select a ride from the Table");
        }


    }}
