/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state_design_pattern;

/**
 *
 * @author Yousef
 */
public class Test {

    public static void main(String[] args) {
        MediaPlayer mp = new MediaPlayer();
        mp.play();
        mp.load();
        mp.pause();
        mp.play();
        mp.stop();
        mp.pause();
        mp.load();
        mp.stop();
        mp.stop();
    }

}

