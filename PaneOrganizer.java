package basicGUI;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

// PaneOrganizer sets up the GUI
public class PaneOrganizer {
	// Creates the BorderPane which will be the root
	private BorderPane _root;

	public PaneOrganizer() {
		this.setupRoot();
	}
	
	// setupRoot instantiates the BorderPane _root and calls setup methods for its contents
	private void setupRoot() {
		_root = new BorderPane();
		// Sets each object in a section of the BorderPane
		_root.setTop(this.setupHBox());
		_root.setLeft(this.setupVBox());
		_root.setCenter(this.setupLabel());
	}
	
	// getRoot returns the BorderPane _root so it can be used to setup the scene
	public BorderPane getRoot() {
		return _root;
	}
	
	// setupHBox creates an HBox
	private HBox setupHBox() {
		// Sets up HBox and its separation
		HBox hbox = new HBox(10);
		hbox.setPrefHeight(50);
		// Sets the alignment of HBox within its section of the BorderPane
		hbox.setAlignment(Pos.BOTTOM_CENTER);
		hbox.setStyle("-fx-background-color: blue;");
		Button topButton1 = new Button("Top Button 1");
		Button topButton2 = new Button("Top Button 2");
		Button topButton3 = new Button("Top Button 3");
		hbox.getChildren().addAll(topButton1, topButton2, topButton3);
		return hbox;
	}

	// setupVBox creates a VBox
	private VBox setupVBox() {
		// Sets up VBox and its separation
		VBox vbox = new VBox(20);
		vbox.setPrefWidth(95);
		// Sets the alignment of VBox within its section of the BorderPane
		vbox.setAlignment(Pos.CENTER_LEFT);
		vbox.setStyle("-fx-background-color: black;");
		Button leftButton1 = new Button("Left Button 1");
		Button leftButton2 = new Button("Left Button 2");
		Button leftButton3 = new Button("Left Button 3");
		vbox.getChildren().addAll(leftButton1, leftButton2, leftButton3);
		return vbox;
	}

	// setupLabel creates a Label
	private Label setupLabel() {
		Label label = new Label("Hello, I'm a red Label");
		// Sets alignment of label within its section of the BorderPane
		label.setAlignment(Pos.CENTER);
		// Sets background color behind the label
		label.setStyle("-fx-background-color: red;");
		return label;
	}

}
