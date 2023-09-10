package visitor_design_pattern_;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Yousef
 */
public class PerimeterShape implements IVisitor {

    @Override
    public void process(Circle circle) {
        System.out.println("perimeter of circle = " + (2 * Math.PI * circle.getRadius()));
    }

    @Override
    public void process(Rectangle rectangle) {
        System.out.println("perimeter of rectangle = " + (2 * (rectangle.getHeight() + rectangle.getWidth())));

    }
}
