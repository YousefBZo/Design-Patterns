package visitor_design_pattern_;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author Yousef
 */
public interface Shape {

    public void draw();

    public void accept(IVisitor visitor);
}
