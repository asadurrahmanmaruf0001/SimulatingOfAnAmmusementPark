package OOPProject.Maruf;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ApplyDiscountController
{
    @javafx.fxml.FXML
    private Label lblDiscountInfo;
    @javafx.fxml.FXML
    private TextField txtVisitorName;
    @javafx.fxml.FXML
    private ComboBox<String> cmbVisitorType;
    @javafx.fxml.FXML
    private TextField txtVisitorAge;

    @javafx.fxml.FXML
    public void initialize() {
        cmbVisitorType.getItems().addAll("Student","Senior citizen","Freedom-fighter");
    }

    @javafx.fxml.FXML
    public void btnApplyDiscount(ActionEvent actionEvent) {
        String name= txtVisitorName.getText();
        String age =txtVisitorAge.getText();
        String type =cmbVisitorType.getValue();
        if (name.isEmpty()||age.isEmpty()||type.isEmpty()){
            lblDiscountInfo.setText(("Please enter all the field"));
        }
    }
}