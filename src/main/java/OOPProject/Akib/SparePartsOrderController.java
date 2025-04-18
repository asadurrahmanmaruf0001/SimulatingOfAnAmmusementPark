package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import OOPProject.Akib.SparePartsOrderModel;

import java.util.ArrayList;

public class SparePartsOrderController
{
    @javafx.fxml.FXML
    private TextField partNameTextField;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField quantityTextField;
    @javafx.fxml.FXML
    private ComboBox<String> supplierComboBox;
    ArrayList<SparePartsOrderModel> orderList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        supplierComboBox.getItems().addAll("Beximco", "Square", "Healthcare");

    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        String partName = partNameTextField.getText();
        String quantityText = quantityTextField.getText();
        String supplier = supplierComboBox.getValue();

        if (partName.isEmpty() || quantityText.isEmpty() || supplier == null) {
            messageLabel.setText("Please fill in all fields.");
            return;
        }

        int quantity;
        try {
            quantity = Integer.parseInt(quantityText);
        } catch (NumberFormatException e) {
            messageLabel.setText("Quantity must be a number.");
            return;
        }

        boolean inStock = false;
        if (!inStock) {
            SparePartsOrderModel order = new SparePartsOrderModel(partName, quantity, supplier);
            orderList.add(order);
            messageLabel.setText("Order Submitted");

            partNameTextField.clear();
            quantityTextField.clear();
            supplierComboBox.setValue(null);
        }

        else {
            messageLabel.setText("Part is already in stock. No need to order.");
        }
    }
}