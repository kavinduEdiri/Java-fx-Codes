import com.sun.org.apache.xml.internal.utils.res.XResources_de;
import com.sun.org.apache.xml.internal.utils.res.XResources_es;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class AppIntilizer extends Application {

    private URL resources;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL url = getClass().getResource("MainFromController");


        primaryStage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainFom.fxml")))));
        primaryStage.show();

        //Object load = FXMLLoader.load(resources);




    }
}
