package OOPProject.Maruf;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VerifyTicketController
{
    @javafx.fxml.FXML
    private TextField txtTicketCode;
    @javafx.fxml.FXML
    private Label lblVerifyResult;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnVerify(ActionEvent actionEvent) {
        String code= txtTicketCode.getText();
        if(code.isEmpty()){
            lblVerifyResult.setText("enter ticket Number");
        }else{
            TicketVerification ticket= new TicketVerification(code);
            lblVerifyResult.setText("Visitor can enter");

            }

        }
    }
