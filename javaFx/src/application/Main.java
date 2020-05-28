package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane(new Button("ok"));
//		pane.getChildren().add(new Button("ok"));
		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setTitle("stack Pane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
//		try {
//		Button bt = new Button("hello\nbye");
//		Scene scene = new Scene(bt, 200, 250);
//		primaryStage.setTitle("javaFX");
//		primaryStage.setScene(scene);
//		primaryStage.show();
//		
//		Stage stage = new Stage();
//		Button bt2 = new Button("welcome");
//		Scene scene2 = new Scene(new Button("suffolk"), 350, 120);
//		stage.setTitle("another one");
//		stage.setScene(scene2);
//		stage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
