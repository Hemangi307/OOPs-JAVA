import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BouncingBallApp extends Application {

    private Circle ball;
    private double dx = 3; // Speed
    private boolean running = false;

    @Override
    public void start(Stage primaryStage) {

        // Ball
        ball = new Circle(20, Color.BLUE);
        ball.setCenterX(50);
        ball.setCenterY(100);

        Pane playArea = new Pane();
        playArea.setPrefSize(600, 300);
        playArea.getChildren().add(ball);

        // Buttons
        Button startBtn = new Button("Start");
        Button stopBtn = new Button("Stop");

        // Slider
        Slider speedSlider = new Slider(1, 10, 3);
        speedSlider.setShowTickLabels(true);
        speedSlider.setShowTickMarks(true);

        // Controls layout
        HBox controls = new HBox(15, startBtn, stopBtn, speedSlider);
        controls.setAlignment(Pos.CENTER);

        BorderPane root = new BorderPane();
        root.setCenter(playArea);
        root.setBottom(controls);

        // Animation
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {

                if (running) {

                    // Move ball
                    ball.setCenterX(ball.getCenterX() + dx);

                    // Bounce on boundaries
                    if (ball.getCenterX() >= playArea.getWidth() - ball.getRadius()
                            || ball.getCenterX() <= ball.getRadius()) {
                        dx = -dx;
                    }
                }
            }
        };

        timer.start();

        // Start button
        startBtn.setOnAction(e -> running = true);

        // Stop button
        stopBtn.setOnAction(e -> running = false);

        // Speed control
        speedSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            double speed = newVal.doubleValue();

            if (dx > 0) {
                dx = speed;
            } else {
                dx = -speed;
            }
        });

        Scene scene = new Scene(root, 700, 400);

        primaryStage.setTitle("Bouncing Ball Animation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011");

        launch(args);
    }
}