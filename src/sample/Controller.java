package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.awt.*;

public class Controller {
    @FXML
    public TextArea ChatTextOut;
    @FXML
    public TextField InputText;


    public void doExit(javafx.event.ActionEvent actionEvent) {
        System.exit(0);
    }

    public void doSend(ActionEvent actionEvent) {
        String str = InputText.getText();
        if (!str.isEmpty()) {
            ChatTextOut.appendText(str + "\n");
            InputText.clear();
        }
    }

    public void doInputKeyDown(KeyEvent keyEvent) {
        if (keyEvent.getCode()== KeyCode.ENTER){
            doSend(new ActionEvent());
        }
    }
}
