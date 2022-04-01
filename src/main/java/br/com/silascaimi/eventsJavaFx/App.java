package br.com.silascaimi.eventsJavaFx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

	public static void main(String[] args) {
		launch();
	}
	
    @Override
    public void start(Stage primaryStage) {
        
    	VBox vbox = new VBox(5.0);
    	vbox.setPadding(new Insets(10));
    	
    	Button btn1 = new Button("Botão 1");
    	btn1.setPrefWidth(100);
    	
    	Button btn2 = new Button("Botão 2");
    	btn2.setPrefWidth(100);
    	
    	vbox.getChildren().addAll(btn1, btn2);
    	
    	TextField text = new TextField();
    	vbox.getChildren().add(text);
    	
    	Scene scene = new Scene(vbox, 400, 300);
		primaryStage.setScene(scene);
    	
        primaryStage.show();
    }

}