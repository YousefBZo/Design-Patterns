/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy_design_pattern;

/**
 *
 * @author Yousef
 */
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageProxy extends ImageView {

    private String imagePath;
    private Image image = null;
    private ImageView imageView;

    public ImageProxy(String imagePath) {
        this.imagePath = imagePath;
        loadImage();
    }

    @Override
    public double minWidth(double height) {
        return super.minWidth(height);
    }

    @Override
    public double minHeight(double width) {
        return super.minHeight(width);
    }

    @Override
    public double maxWidth(double height) {
        return super.maxWidth(height);
    }

    @Override
    public double maxHeight(double width) {
        return super.maxHeight(width);
    }

    protected double computePrefWidth(double height) {
        if (imageView == null) {
            loadImage();
        }
        return imageView.prefWidth(height);
    }

    protected double computePrefHeight(double width) {
        if (imageView == null) {
            loadImage();
        }
        return imageView.prefHeight(width);
    }

    protected void layoutChildren() {
        if (imageView == null) {
            loadImage();
        }
        imageView.layoutXProperty().set(getLayoutX());
        imageView.layoutYProperty().set(getLayoutY());
        imageView.setFitWidth(getBoundsInParent().getWidth());
        imageView.setFitHeight(getBoundsInParent().getHeight());
    }

    private void loadImage() {
        image = new Image(imagePath);
        imageView = new ImageView(image);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        imageView.setCache(true);
    }
}
