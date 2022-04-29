package example.calculator1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField num1Field;

    @FXML
    private TextField num2Field;

    @FXML
    private TextField resultField;

    private int num1;
    private int num2;
    private int result;
    private Model model = new Model();

    @FXML
    void addClick() {

        num1 = Integer.parseInt(num1Field.getText());
        num2 = Integer.parseInt(num2Field.getText());
        result = model.calculate(num1, num2, '+');
        resultField.setText(String.valueOf(result));

    }

    @FXML
    void subClick() {

        num1 = Integer.parseInt(num1Field.getText());
        num2 = Integer.parseInt(num2Field.getText());
        result = model.calculate(num1, num2, '-');
        resultField.setText(String.valueOf(result));
    }

}
