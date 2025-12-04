import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Starter extends Application {
    @Override
    public void start(Stage stage){
        try {
            stage.setScene(new Scene(FXMLLoader.load((getClass().getResource("/ui/login_page.fxml")))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    public static void main(String[] args) {
        Starter.launch();
    }
}
