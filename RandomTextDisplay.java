import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import java.util.Random;

public class RandomTextDisplay extends Application {

    @Override
    public void start(Stage stage) {

        VBox vbox = new VBox();
        vbox.setSpacing(15);
        vbox.setAlignment(Pos.CENTER);

        Random random = new Random();

        for (int i = 1; i <= 5; i++) {

            Text txt = new Text("Text " + i);

            txt.setFont(Font.font(
                    "Times New Roman",
                    FontWeight.BOLD,
                    FontPosture.ITALIC,
                    22
            ));

            txt.setFill(Color.color(
                    random.nextDouble(),
                    random.nextDouble(),
                    random.nextDouble()
            ));

            txt.setOpacity(0.3 + random.nextDouble() * 0.7);

            vbox.getChildren().add(txt);
        }

        Scene scene = new Scene(vbox, 500, 400);

        stage.setTitle("Random Text Display");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011");
        launch(args);
    }
}