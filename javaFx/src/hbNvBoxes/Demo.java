package hbNvBoxes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.College;
import model.Student;
import view.FacultyPane;
import view.StudentPane;
import view.TextBookPane;

public class Demo extends Application {
	private Button insertButton;
	private Button searchButton;
	private Button updateButton;
	private Button removeButton;

	private TextField nameField;
	private TextField idField;
	
	private HBox hBox;
	private HBox buttonBox;
	private VBox root;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		StudentBag sBag = new StudentBag(1000);
		College college = new College();
		
		VBox box1 = new VBox();
		StudentPane studentPane = new StudentPane(college.getABag);
		FacultyPane fPane= new FacultyPane(sBag);
		TextBookPane tPane = new TextBookPane(college.);
		
		buildButtons();
		buildTextFields();
		buildHboxes();
		buildVBox();

		insertButton.setOnAction(e -> {
			String name = nameField.getText();
			Student student = new Student(name);
			sBag.insert(student);
			nameField.clear();
//			firstName.setText("vd");
//			frist.clear();
		});

		searchButton.setOnAction(e -> {
			String id = idField.getText();
			Student s = sBag.searchById(id);
			nameField.setText(s.getName());
			idField.setText(s.getId());
			
		});

//		updateButton.setOnAction(e -> {
//			label.setText("update button clicked");
//		});
//
//		removeButton.setOnAction(e -> {
//			label.setText("remove button clicked");
//		});

		hBox.getChildren().addAll(nameField, idField);
		buttonBox.getChildren().addAll(insertButton, searchButton, updateButton, removeButton);
		root.getChildren().addAll(hBox, buttonBox);
		Scene scene = new Scene(root, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("title");
		primaryStage.show();
	}

	private void buildVBox() {
		root = new VBox();
		root.setAlignment(Pos.CENTER);
	}
	private void buildHboxes() {
		hBox =  new HBox();
		buttonBox =  new HBox();
		hBox.setAlignment(Pos.CENTER);
		buttonBox.setAlignment(Pos.CENTER);
	}

	private void buildTextFields() {
		nameField = new TextField();
		idField = new TextField();
//		idField.setDisable(true);
		nameField.setPromptText("NAME");
		idField.setPromptText("ID");
	}

	private void buildButtons() {
		insertButton = new Button("insert");
		searchButton = new Button("SEARCH");
		updateButton = new Button("UPDATE");
		removeButton = new Button("REMOVE");
	}

}
