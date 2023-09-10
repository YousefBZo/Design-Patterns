/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy_design_pattern;

/**
 *
 * @author Yousef
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ImageGalleryApp extends Application {

    private Label imageLabel;
    private Button previousButton;
    private Button nextButton;

    private String[] imagePaths = {
        "image01.jpg",
        "image02.jpg",
        "image03.jpg",
        "image04.jpg",
        "image05.jfif",
        "image06.jpg"
    };
    private ArrayList<Image> images = new ArrayList<>();

    private int currentIndex;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        currentIndex = 0;

        // Set up the stage
        primaryStage.setTitle("Image Gallery");

        // Create the image label
        imageLabel = new Label();
        imageLabel.setStyle("-fx-alignment: center;");

        long startTime = System.nanoTime();
        for (String imagePath : imagePaths) {
            Image image = new Image(imagePath);
            images.add(image);
        }
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        double milliseconds = (double) elapsedTime / 1_000_000.0;
        System.out.println("Running time: " + milliseconds + " milliseconds");

        updateImage();

        // Create the previous button
        previousButton = new Button("Previous");
        previousButton.setOnAction(e -> {
            currentIndex--;
            if (currentIndex < 0) {
                currentIndex = imagePaths.length - 1;
            }
            updateImage();
        });

        // Create the next button
        nextButton = new Button("Next");
        nextButton.setOnAction(e -> {
            currentIndex++;
            if (currentIndex >= imagePaths.length) {
                currentIndex = 0;
            }
            updateImage();
        });

        // Create an HBox for the buttons
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(previousButton, nextButton);

        // Create a BorderPane and add the components
        BorderPane root = new BorderPane();
        root.setCenter(imageLabel);
        root.setBottom(buttonBox);

        // Create the scene and set it on the stage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void updateImage() {
        imageLabel.setGraphic(new ImageView(images.get(currentIndex)));
    }
}
