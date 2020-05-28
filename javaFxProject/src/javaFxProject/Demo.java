package javaFxProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import menuAndItems.MenuAndItems;
import fileChoooserSample.FileChooserFinal;
import helpers.Helper;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import model.College;
import saveAndRestoreFile.FileRestorer;
import saveAndRestoreFile.FileSaver;
import view.ClassRoomPane;
import view.CoursePane;
import view.FacultyCourseInfoPane;
import view.FacultyPane;
import view.StudentCourseInfoPane;
import view.StudentPane;
import view.TextBookPane;

public class Demo extends Application {
//	private static College college = new College();
	
// textbook not working
	// read multiple line for textbook importing
	
	public static void main(String[] args) throws FileNotFoundException {
//		Helper.courses(college.getMasterCourseBag());
////		Helper.textBooks(college.getTextBookBag());
//		Helper.students(college.getPersonBag(), college);
//		Helper.classRooms(college.getClassRoomBag());
//		Helper.faculty(college.getFacultyCourseBag(), college);
		launch(args);
	}
//
	@Override
	public void start(Stage primaryStage) throws Exception {
		MenuAndItems borderPane = new MenuAndItems();
		Pane root = borderPane.getMenu(primaryStage);
		
//		BorderPane root = new BorderPane();
//		MenuBar menuBar = new MenuBar();
//		Menu fileMenu = new Menu("File");
//		MenuItem exitItem = new MenuItem("Exit");
//
//		exitItem.setOnAction(e -> {
//			Platform.exit();
//		});
//
//		Menu importMenu = new Menu("Import");
//
//		MenuItem studentImportItem = new MenuItem("Student");
//		MenuItem facultyImportItem = new MenuItem("Faculty");
//		MenuItem textBookImportItem = new MenuItem("Textbook");
//		MenuItem classRoomImportItem = new MenuItem("Classroom");
//		MenuItem courseImportItem = new MenuItem("Course");
//		importMenu.getItems().addAll(studentImportItem, facultyImportItem, courseImportItem, textBookImportItem,
//				classRoomImportItem);
//
//		Menu exportMenu = new Menu("Export");
//		MenuItem studentExportItem = new MenuItem("Student");
//		MenuItem facultyExportItem = new MenuItem("Faculty");
//		MenuItem courseExportItem = new MenuItem("Course");
//		MenuItem textBookExportItem = new MenuItem("Textbook");
//		MenuItem classRoomExportItem = new MenuItem("Classroom");
//		exportMenu.getItems().addAll(studentExportItem, facultyExportItem, courseExportItem, textBookExportItem,
//				classRoomExportItem);
//		
//		MenuItem backUpItem = new MenuItem("Backup");
//		MenuItem restoreItem = new MenuItem("Restore");
//
//		fileMenu.getItems().addAll(importMenu, 
//									exportMenu,
////									new Separator(),
//									backUpItem,
//									restoreItem,
////									new Separator(),
//									exitItem);
//		Menu editMenu = new Menu("Edit");
//		MenuItem studentCourseInfoItem = new MenuItem("StudentCourseInfo");
//		MenuItem studentItem = new MenuItem("Student");
//		MenuItem facultyItem = new MenuItem("Faculty");
//		MenuItem facultyCourseInfoItem = new MenuItem("FacultyCourseInfo");
//		MenuItem courseItem = new MenuItem("Course");
//		MenuItem textBookItem = new MenuItem("Textbook");
//		MenuItem classRoomItem = new MenuItem("Classroom");
//
//		editMenu.getItems().addAll(studentItem, studentCourseInfoItem, facultyItem, facultyCourseInfoItem,
////									new Separator(),
//				courseItem, textBookItem,
////									new Separator(),
//				classRoomItem);
//
//		menuBar.getMenus().addAll(fileMenu, editMenu);
//
//		Pane buttonBox = new ButtonPane().getButtonBox();
//
//		facultyItem.setOnAction(e -> {
//			Pane facultyPane = new FacultyPane(college).getPane();
//			Scene scene3 = new Scene(facultyPane, 800, 500);
//			primaryStage.setScene(scene3);
//			primaryStage.show();
//		});
//
//		studentItem.setOnAction(e -> {
//			StudentPane sp = new StudentPane(college);
//			Pane studentPane = sp.getVbox();
//			Scene scene2 = new Scene(studentPane, 800, 500);
//			primaryStage.setScene(scene2);
//			primaryStage.show();
//		});
//
//		courseItem.setOnAction(e -> {
//			Pane coursePane = new CoursePane(college).getPane();
//			Scene scene3 = new Scene(coursePane, 800, 500);
//			primaryStage.setScene(scene3);
//			primaryStage.show();
//		});
//
//		textBookItem.setOnAction(e -> {
//			Pane textBookPane = new TextBookPane(college).getPane();
//			Scene scene3 = new Scene(textBookPane, 800, 500);
//			primaryStage.setScene(scene3);
//			primaryStage.show();
//		});
//
//		classRoomItem.setOnAction(e -> {
//			Pane classRoomPane = new ClassRoomPane(college).getPane();
//			Scene scene3 = new Scene(classRoomPane, 800, 500);
//			primaryStage.setScene(scene3);
//			primaryStage.show();
//		});
//
//		studentCourseInfoItem.setOnAction(e -> {
//			Pane studentCourseInfoPane = new StudentCourseInfoPane(college).getPane();
//			Scene scene3 = new Scene(studentCourseInfoPane, 800, 500);
//			primaryStage.setScene(scene3);
//			primaryStage.show();
//		});
//
//		facultyCourseInfoItem.setOnAction(e -> {
//			Pane facultyCourseInfoPane = new FacultyCourseInfoPane(college).getPane();
//			Scene scene3 = new Scene(facultyCourseInfoPane, 800, 500);
//			primaryStage.setScene(scene3);
//			primaryStage.show();
//		});
//
//		studentImportItem.setOnAction(e -> {
//			TextArea textArea = new TextArea();
//			HBox pane = new HBox(5);
//			FileChooser fileChooser = new FileChooser();
//			
//			String str = new String();
//			
//			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
//			fileChooser.getExtensionFilters().add(extFilter);
//
//			File file = fileChooser.showOpenDialog(primaryStage);
//			if (file != null) {
//				try {
//					str = FileChooserFinal.readFile(file, college);
//				} catch (FileNotFoundException e1) {
//					System.out.println(e);
//				}
//			}
//			
//			textArea.appendText(str);
//			pane.getChildren().add(textArea);
//			primaryStage.setScene(new Scene(pane, 400, 250));
//			primaryStage.show();
//		});
//		
//		facultyImportItem.setOnAction(e ->{
//			TextArea textArea = new TextArea();
//			textArea.setMaxHeight(500);
//			textArea.setMaxWidth(1000);
//			HBox pane = new HBox(5);
//			FileChooser fileChooser = new FileChooser();
//			
//			String str = new String();
//			
//			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
//			fileChooser.getExtensionFilters().add(extFilter);
//
//			File file = fileChooser.showOpenDialog(primaryStage);
//			if (file != null) {
//				try {
//					str = FileChooserFinal.readFacultyFile(file, college);
//				} catch (FileNotFoundException e1) {
//					System.out.println(e);
//				}
//			}
//			
//			textArea.appendText(str);
//			pane.getChildren().add(textArea);
//			primaryStage.setScene(new Scene(pane, 600, 350));
//			primaryStage.show();
//		});
//		
////		textBookImportItem.setOnAction(e ->{
////			TextArea textArea = new TextArea();
////			HBox pane = new HBox(5);
////			FileChooser fileChooser = new FileChooser();
////			
////			String str = new String();
////			
////			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
////			fileChooser.getExtensionFilters().add(extFilter);
////
////			File file = fileChooser.showOpenDialog(primaryStage);
////			if (file != null) {
////				try {
////					str = FileChooserFinal.readTextbookFile(file, college);
////				} catch (FileNotFoundException e1) {
////					System.out.println(e);
////				}
////			}
////			
////			textArea.appendText(str);
////			pane.getChildren().add(textArea);
////			primaryStage.setScene(new Scene(pane, 400, 250));
////			primaryStage.show();
////		});
//		
//		classRoomImportItem.setOnAction(e ->{
//			TextArea textArea = new TextArea();
//			HBox pane = new HBox(5);
//			FileChooser fileChooser = new FileChooser();
//			
//			String str = new String();
//			
//			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
//			fileChooser.getExtensionFilters().add(extFilter);
//
//			File file = fileChooser.showOpenDialog(primaryStage);
//			if (file != null) {
//				try {
//					str = FileChooserFinal.readClassRoomFile(file, college);
//				} catch (FileNotFoundException e1) {
//				System.out.println(e);
//				}
//			}
//			
//			textArea.appendText(str);
//			pane.getChildren().add(textArea);
//			primaryStage.setScene(new Scene(pane, 400, 700));
//			primaryStage.show();
//		});
//
//		courseImportItem.setOnAction(e ->{
//			TextArea textArea = new TextArea();
//
//			HBox pane = new HBox(5);
//			FileChooser fileChooser = new FileChooser();
//			
//			String str = new String();
//			
//			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
//			fileChooser.getExtensionFilters().add(extFilter);
//
//			File file = fileChooser.showOpenDialog(primaryStage);
//			if (file != null) {
//				try {
//					str = FileChooserFinal.readCourseFile(file, college);
//				} catch (FileNotFoundException e1) {
//				System.out.println(e);
//				}
//			}
//			
//			textArea.appendText(str);
//			pane.getChildren().add(textArea);
//			primaryStage.setScene(new Scene(pane, 500, 500));
//			primaryStage.show();
//		});
//		
//		studentExportItem.setOnAction(e -> {
//			HBox pane = new HBox(5);
//			Button btn = new Button("Successfully Exported");
//			pane.setAlignment(Pos.CENTER);
//			btn.setMaxWidth(200);
//			btn.setMaxHeight(40);
//			
//			FileChooser fileChooser = new FileChooser();
//		
//			String str = college.getPersonBag().getPersonBagArray();
//
//			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
//			fileChooser.getExtensionFilters().add(extFilter);
//
//			File file = fileChooser.showSaveDialog(primaryStage);
//
//			if (file != null) {
//				FileChooserFinal.exportFile(college.getPersonBag().getPersonBagArray(), file);
//			}
//			pane.getChildren().add(btn);
//			primaryStage.setScene(new Scene(pane, 400, 250));
//			primaryStage.show();
//		});
//		
//		facultyExportItem.setOnAction(e -> {
//			HBox pane = new HBox(5);
//			Button btn = new Button("Successfully Exported");
//			pane.setAlignment(Pos.CENTER);
//			btn.setMaxWidth(200);
//			btn.setMaxHeight(40);
//			
//			FileChooser fileChooser = new FileChooser();
//			TextArea textArea2 = new TextArea();
//			String str = college.getPersonBag().getPersonBagArray();
////			System.out.println(str);
//			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
//			fileChooser.getExtensionFilters().add(extFilter);
//
//			File file = fileChooser.showSaveDialog(primaryStage);
//
//			if (file != null) {
//				FileChooserFinal.exportFacultyFile(college.getPersonBag().getFacultyBagArray(), file);
//			}
//			pane.getChildren().add(btn);
//			primaryStage.setScene(new Scene(pane, 400, 250));
//			primaryStage.show();
//		});
//		
//		courseExportItem.setOnAction(e -> {
//			HBox pane = new HBox(5);
//			Button btn = new Button("Successfully Exported");
//			pane.setAlignment(Pos.CENTER);
//			btn.setMaxWidth(200);
//			btn.setMaxHeight(40);
//			
//			FileChooser fileChooser = new FileChooser();
//			TextArea textArea2 = new TextArea();
//			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
//			fileChooser.getExtensionFilters().add(extFilter);
//
//			File file = fileChooser.showSaveDialog(primaryStage);
//
//			if (file != null) {
//				FileChooserFinal.exportCourseFile(college.getMasterCourseBag().getMasterCourseBag(), file);
//			}
//			pane.getChildren().add(btn);
//			primaryStage.setScene(new Scene(pane, 400, 250));
//			primaryStage.show();
//		});
//		
//		textBookExportItem.setOnAction(e -> {
//			HBox pane = new HBox(5);
//			Button btn = new Button("Successfully Exported");
//			pane.setAlignment(Pos.CENTER);
//			btn.setMaxWidth(200);
//			btn.setMaxHeight(40);
//			
//			FileChooser fileChooser = new FileChooser();
//			TextArea textArea2 = new TextArea();
//
//			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
//			fileChooser.getExtensionFilters().add(extFilter);
//
//			File file = fileChooser.showSaveDialog(primaryStage);
//			if (file != null) {
//				FileChooserFinal.exportTextBookFile(college, file);
//			}
//			pane.getChildren().add(btn);
//			primaryStage.setScene(new Scene(pane, 400, 250));
//			primaryStage.show();
//		});
//		
//		classRoomExportItem.setOnAction(e -> {
//			HBox pane = new HBox(5);
//			Button btn = new Button("Successfully Exported");
//			pane.setAlignment(Pos.CENTER);
//			btn.setMaxWidth(200);
//			btn.setMaxHeight(40);
//			
//			FileChooser fileChooser = new FileChooser();
//			TextArea textArea2 = new TextArea();
//		
//			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
//			fileChooser.getExtensionFilters().add(extFilter);
//
//			File file = fileChooser.showSaveDialog(primaryStage);
//
//			if (file != null) {
//				FileChooserFinal.exportClassRoomFile(college.getClassRoomBag().getClassroomBag(), file);
//			}
//			pane.getChildren().add(btn);
//			primaryStage.setScene(new Scene(pane, 400, 250));
//			primaryStage.show();
//		});
//		
//		backUpItem.setOnAction(e ->{
//			HBox pane = new HBox(5);
//			Button btn = new Button("Successfully Saved BinaryFile");
//			pane.setAlignment(Pos.CENTER);
//			btn.setMaxWidth(200);
//			btn.setMaxHeight(40);
//			
//			FileChooser fc = new FileChooser();
//			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("BINARY Files (*.dat)", "*.dat");
//			fc.getExtensionFilters().add(extFilter);
//			
//			File file = fc.showSaveDialog(primaryStage);
//
//			if (file != null) {
//				try {
//					FileSaver.saveBinaryFile(file, college);
//				} catch (IOException e1) {
//				System.out.println(e1);
//				}
//			}
////			System.out.println();
//			pane.getChildren().add(btn);
//			primaryStage.setScene(new Scene(pane, 400, 250));
//			primaryStage.show();
//		});
//		
//		restoreItem.setOnAction(e ->{
//			HBox pane = new HBox(5);
//			pane.setAlignment(Pos.CENTER);
//			TextArea textArea = new TextArea();
//			textArea.setMaxHeight(1000);
//			textArea.setMaxWidth(1000);
//			
//			FileChooser fc = new FileChooser();
//			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("BINARY Files (*.dat)", "*.dat");
//			fc.getExtensionFilters().add(extFilter);
//			
//			String str= "";
//			File file = fc.showOpenDialog(primaryStage);
//
//			if (file != null) {
//				try {
//					try {
//						str = FileRestorer.restoreFile(file);
//					} catch (ClassNotFoundException e1) {
//						System.out.println(e1);
//					}
//				} catch (IOException e1) {
//				System.out.println(e1);
//				}
//			}
//			textArea.appendText(str);
//			pane.getChildren().add(textArea);
//			primaryStage.setScene(new Scene(pane, 850, 500));
//			primaryStage.show();
//		});
		
//		root.setCenter(studentPane);
//		root.setTop(menuBar);
//		root.setBottom(studentPane2);
//		
//		root.setMargin(studentPane2, new Insets(20, 20, 30, 20)); 
		Scene scene = new Scene(root, 600, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}