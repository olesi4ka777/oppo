package ipap.oppo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label Labelres;

    @FXML
    private TextField txtA;

    @FXML
    private TextField txtB;

    @FXML
    private TextField txtC;

    @FXML
    void area() {
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        double c = Double.parseDouble(txtC.getText());
        double s = a + b + c * 2;
        Labelres.setText("Result this" + s);
    }
        @FXML
        void divide () {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double c = a / b;
            Labelres.setText("Result this" + c);
        }

        @FXML
        void minus () {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double c = a - b;
            Labelres.setText("Result this" + c);
        }

        @FXML
        void multiplay () {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double c = a * b;
            Labelres.setText("Result this" + c);
        }

        @FXML
        void summa () {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double c = a + b;
            Labelres.setText("Result this" + c);
        }

    }



