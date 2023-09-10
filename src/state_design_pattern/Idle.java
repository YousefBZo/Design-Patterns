/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state_design_pattern;

/**
 *
 * @author Yousef
 */
public class Idle extends IPlayerState {

    public Idle(MediaPlayer mp) {
        super(mp);
    }

    @Override
    public void load() {
        System.out.println("Loading audio track from disk");
        mp.setPlayerState(new Ready(mp));
    }

    @Override
    public void unload() {
    }

    @Override
    public void play() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void pause() {
    }

}
