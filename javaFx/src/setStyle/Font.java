package setStyle;

import java.awt.Label;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Font extends Application {
	public void start(Stage stage) {
		StackPane pane = new StackPane();
		
		Circle circle = new Circle();
		circle.setRadius(80);
		circle.setStroke(Color.BLACK);
		circle.setFill(new Color(.5, .5, .5, .5));
		pane.getChildren().add(circle);
		Label lb = new Label("javaFX");
		lb.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		pane.getChildren().add(lb);
		Scene scene = new Scene(pane, 400, 400);
		
		stage.setTitle("font");
		stage.setScene(scene);
		stage.show();
	}

	private static java.awt.Font font(String string, FontWeight bold, FontPosture italic, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
