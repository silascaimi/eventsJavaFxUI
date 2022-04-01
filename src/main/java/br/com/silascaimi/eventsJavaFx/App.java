package br.com.silascaimi.eventsJavaFx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
		primaryStage.setTitle("Eventos");

		primaryStage.setOnCloseRequest(event -> {
			showDialog("Tchau");
			event.consume(); // o evento para de ser propagado
		});

		VBox vbox = new VBox(5.0);
		vbox.setPadding(new Insets(10));

		// Botão com evento de ação
		Button btn1 = new Button("Botão 1");
		btn1.setOnAction(event -> showDialog("Botão 1 foi pressionado"));
		btn1.setPrefWidth(100);

		// Botão com evento de mouse
		String qm = "?????";
		Button btn2 = new Button(qm);
		btn2.setOnMouseEntered(event -> btn2.setText("Botão 2"));
		btn2.setOnMouseExited(event -> btn2.setText(qm));
		btn2.setPrefWidth(100);

		vbox.getChildren().addAll(btn1, btn2);

		// Input texto com evento de key
		TextField text = new TextField();
		text.setOnKeyTyped(event -> System.out.println(event.getCharacter()));
		vbox.getChildren().add(text);

		Scene scene = new Scene(vbox, 400, 300);
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	private void showDialog(String msg) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Informação");
		alert.setHeaderText("Mensagem do sistema");
		alert.setContentText(msg);
		alert.showAndWait();
	}

}