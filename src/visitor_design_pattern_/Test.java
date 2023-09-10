package visitor_design_pattern_;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yousef
 */
public class Test {

    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(15);
        Rectangle r1 = new Rectangle(10, 20);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(r1);
        AreaShape v = new AreaShape();
        PerimeterShape v2 = new PerimeterShape();
        for (Shape s : shapes) {
            s.accept(v);
            s.accept(v2);
            System.out.println("-----------");
        }

    }

}
