import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrationForm extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label rollLabel = new Label("Roll No:");
        Label nameLabel = new Label("Name:");
        Label ageLabel = new Label("Age:");
        Label emailLabel = new Label("Email:");
        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();
        Button submitButton = new Button("Submit");
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(rollLabel, 0, 0);
        grid.add(rollField, 1, 0);
        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);
        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);
        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);
        grid.add(submitButton, 1, 4);
        submitButton.setOnAction(e -> {
            try {
                int rollNo = Integer.parseInt(rollField.getText());
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                String email = emailField.getText();
                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid Email Format");
                }
                // Save using FileChooser
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Save Registration Data");
                fileChooser.setInitialFileName("registration.txt");
                File file = fileChooser.showSaveDialog(primaryStage);
                if (file != null) {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write("Roll No: " + rollNo);
                    writer.newLine();
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Age: " + age);
                    writer.newLine();
                    writer.write("Email: " + email);
                    writer.close();
                }
                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful");
                success.setContentText(
                        "Roll No: " + rollNo +
                                "\nName: " + name +
                                "\nAge: " + age +
                                "\nEmail: " + email
                );
                success.showAndWait();
            } catch (NumberFormatException ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Validation Error");
                error.setHeaderText("Invalid Input");
                error.setContentText("Roll No and Age must be integers.");
                error.showAndWait();
            } catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Validation Error");
                error.setHeaderText("Invalid Input");
                error.setContentText(ex.getMessage());
                error.showAndWait();
            }
        });
        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setTitle("Student Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011");
        launch(args);
    }
}
