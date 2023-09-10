/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder_desing_pattern;

/**
 *
 * @author Yousef
 */
public class Car {

    private String name, model, year, color, speed;
    private double price;

    private Car(String name, String model, String year, String color, String speed, double price) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    public static class builder {

        private String name, model, year, color, speed;
        private double price;

        public void setName(String name) {
            this.name = name;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setSpeed(String speed) {
            this.speed = speed;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Car build() {
            if (name == null) {
                throw new IllegalArgumentException("error");
            }

            if (speed == null) {
                throw new IllegalArgumentException("error");
            }

            if (year == null) {
                throw new IllegalArgumentException("error");
            }

            return new Car(name, model, year, color, speed, price);
        }
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", model=" + model + ", year=" + year + ", color=" + color + ", speed=" + speed + ", price=" + price + '}';
    }

}
