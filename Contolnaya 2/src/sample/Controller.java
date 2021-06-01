package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
public class Controller {
    @FXML
    TextField login;
    @FXML
    PasswordField pass;
    @FXML
    Label label;
    @FXML
    Button Enter;
    @FXML
    public void Enter(ActionEvent event){
        if(login.getText().equals("admin") && pass.getText().equals("admin")){
            label.setText("Hello admin");
        }
        else {
            label.setText("Invalid login or password");
        }
    }
}
