package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    Button chatSend;
    @FXML
    TextField chatText;
    @FXML
    TextArea chatMessage;

    @FXML
    public void sendMessage(ActionEvent event) {
        String x = chatText.getText();
        chatMessage.appendText("Your message: " + x + "\n");
        chatText.setText("");
    }

}
