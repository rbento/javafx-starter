
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage stage) {

		var javaVersion = SystemInfo.javaVersion();
		var javafxVersion = SystemInfo.javafxVersion();

		var label = new Label("JavaFX " + javafxVersion + " running on Java " + javaVersion);
		var scene = new Scene(new StackPane(label), 1280, 800);

		stage.setTitle("JavaFX");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
