package ipap.oppo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

    public class HelloController {

        @FXML
        private Label Labelres;

        @FXML
        private Label txtA;

        @FXML
        private Label txtB;

        @FXML
        void divide(ActionEvent event) {
            double a=Double.parseDouble(txtA.getText());
            double b=Double.parseDouble(txtB.getText());
            double c=a/b;
            Labelres.setText("Result this"+c);
        }

        @FXML
        void minus(ActionEvent event) {
            double a=Double.parseDouble(txtA.getText());
            double b=Double.parseDouble(txtB.getText());
            double c=a-b;
            Labelres.setText("Result this"+c);
        }

        @FXML
        void multiplay(ActionEvent event) {
            double a=Double.parseDouble(txtA.getText());
            double b=Double.parseDouble(txtB.getText());
            double c=a*b;
            Labelres.setText("Result this"+c);
        }

        @FXML
        void summa(ActionEvent event) {
            double a=Double.parseDouble(txtA.getText());
            double b=Double.parseDouble(txtB.getText());
            double c=a+b;
            Labelres.setText("Result this"+c);
        }

    }






