package circle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {
	public void start(Stage primaryStage) {
//		Circle circle = new Circle();
//		circle.setCenterX(150);
//		circle.setCenterY(150);
//		circle.setRadius(75);
//		circle.setFill(Color.BLUE);
//		circle.setStroke(Color.BLACK);
//		
//		Pane pane = new Pane();
//		pane.getChildren().add(circle);
//		
//		Scene scene = new Scene(pane, 300,300);
//		primaryStage.setTitle("Circle");
//		primaryStage.setScene(scene);
//		primaryStage.show();

		Pane pane = new Pane();
		Circle circle = new Circle();
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.YELLOW);
		pane.getChildren().add(circle);
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
