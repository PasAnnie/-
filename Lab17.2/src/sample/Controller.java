package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Label nol;

    @FXML
    private void plus(ActionEvent event){
        int x = Integer.parseInt(nol.getText());
        if (x<3) x++;
        nol.setText(String.valueOf(x));
    }

    @FXML
    private void minus(ActionEvent event){
        int x = Integer.parseInt(nol.getText());
        if (x>-5) x--;
        nol.setText(String.valueOf(x));
    }
}
