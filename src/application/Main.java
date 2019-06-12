package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;
import java.lang.Math;

public class Main extends Application {
	@Override

	public void start(Stage primaryStage) {
		int fillColor;
		Group g = new Group();
		Random rand = new Random();
		for (int i = 0; i < 512; i += 8) {
			for (int j = 0; j < 512; j += 8) {
				Rectangle rec = new Rectangle(j, i, (j +8), (i + 8));
				fillColor = Math.round(rand.nextInt(2));
				if (fillColor == 0)
					rec.setFill(Color.WHITE);
				else
					rec.setFill(Color.BLACK);
				g.getChildren().add(rec);

			}}

		Rectangle rec1 = new Rectangle(0, 0, 125, 125);
		Rectangle rec2 = new Rectangle(0, 387, 125, 512);
		Rectangle rec3 = new Rectangle(387, 0, 512, 125);

		Rectangle rec4 = new Rectangle(15, 15, 95, 95);
		rec4.setFill(Color.WHITE);
		Rectangle rec5 = new Rectangle(15, 402, 95, 95);
		rec5.setFill(Color.WHITE);
		Rectangle rec6 = new Rectangle(402, 15, 95, 95);
		rec6.setFill(Color.WHITE);

		Rectangle rec7 = new Rectangle(30, 30, 65, 65);
		Rectangle rec8 = new Rectangle(30, 417, 65, 65);
		Rectangle rec9 = new Rectangle(417, 30, 65, 65);

		Group root = new Group(g, rec1, rec2, rec3, rec4, rec5, rec6, rec7, rec8, rec9);
		Scene scene = new Scene(root, 512, 512, Color.WHITE);

		primaryStage.setTitle("QR:");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {

		launch(args);
	}
}
