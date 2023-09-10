/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state_design_pattern;

/**
 *
 * @author Yousef
 */
public class Playing extends IPlayerState {

    public Playing(MediaPlayer mp) {
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
    }

    @Override
    public void stop() {
        System.out.println("Stop file");
        mp.setPlayerState(new Ready(mp));
    }

    @Override
    public void pause() {
        System.out.println("Pause file");
        mp.setPlayerState(new Paused(mp));
    }

}
