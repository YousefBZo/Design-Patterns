/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state_design_pattern;

/**
 *
 * @author Yousef
 */
public class Ready extends IPlayerState {

    public Ready(MediaPlayer mp) {
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
        System.out.println("start playing..");
        mp.setPlayerState(new Playing(mp));
    }

    @Override
    public void stop() {
    }

    @Override
    public void pause() {
    }

}
