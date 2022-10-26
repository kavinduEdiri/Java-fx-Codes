import javafx.fxml.FXML;

import java.awt.event.ActionEvent;

public class MainFormController {
    @FXML
    void ClickMeOnAction(ActionEvent event) {
        System.out.println("hi");

    }

    public void ClickMeOnAction(javafx.event.ActionEvent actionEvent) {

        System.out.println("hi");
    }
}
