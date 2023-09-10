package visitor_design_pattern_;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Yousef
 */
public class AreaShape implements IVisitor {

    @Override
    public void process(Circle circle) {
        System.out.println("Circle area = " + (Math.PI * circle.getRadius() * circle.getRadius()));
    }

    @Override
    public void process(Rectangle rectangle) {
        System.out.println("Rectangle area = " + (rectangle.getWidth() * rectangle.getHeight()));
    }
}
