package setStyle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Demo extends Application{
		public void start(Stage primaryStage) {
			StackPane pane = new StackPane();
//			Button bt1 = new Button("bgrfecdw");
			Button bt = new Button("OK");
//			pane.getChildren().add(bt1);
			pane.getChildren().add(bt);
			
//			Circle c = new Circle();
//			c.setStyle("-fx-background-color: black");
//			bt.setShape(c);
			bt.setStyle("-fx-border-color: red; -fx-background-color: lightblue");
			pane.setStyle("-fx-border-color: black;-fx-background-color: lightgreen");
			pane.setRotate(45);
			Scene scene = new Scene(pane, 300, 300);
			primaryStage.setScene(scene);
			primaryStage.setTitle("graphics");
			primaryStage.show();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}