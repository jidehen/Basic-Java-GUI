package basicGUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

// App needs to extend Application to set up the GUI
public class App extends Application {

	// Must launch args
	public static void main(String[] args) {
		launch(args);
	}
	
	// Override the start method in Application
	@Override
	public void start(Stage stage) {
		// Creates a pane organizer to call getRoot and get the BorderPane I setup at the root
		PaneOrganizer organizer = new PaneOrganizer();
		// Creates the scene. Root, Width, Height
		Scene scene = new Scene(organizer.getRoot(), 500, 500);
		// Sets the scene
		stage.setScene(scene);
		// Shows the scene
		stage.show();
	}
}
