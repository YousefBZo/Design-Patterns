/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state_design_pattern;

/**
 *
 * @author Yousef
 */
public class Paused extends IPlayerState {

    public Paused(MediaPlayer mp) {
        super(mp);
    }

    @Override
    public void load() {

    }

    @Override
    public void unload() {
        System.out.println("Unloading file");
        mp.setPlayerState(new Idle(mp));
    }

    @Override
    public void play() {
        System.out.println("Play file");
        mp.setPlayerState(new Playing(mp));
    }

    @Override
    public void stop() {
        System.out.println("Stop file");
        mp.setPlayerState(new Ready(mp));
    }

    @Override
    public void pause() {

    }

}
