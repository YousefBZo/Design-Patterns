package visitor_design_pattern_;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Yousef
 */
public interface IVisitor {

    public void process(Circle circle);

    public void process(Rectangle rectangle);
}
