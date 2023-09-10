/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state_design_pattern;

/**
 *
 * @author Yousef
 */
public class MediaPlayer {

    IPlayerState playerState;

    public void setPlayerState(IPlayerState playerState) {
        this.playerState = playerState;
    }

    public MediaPlayer() {
        playerState = new Idle(this);
    }

    public void load() {
        playerState.load();

    }

    public void unload() {
        playerState.unload();
    }

    public void play() {
        playerState.play();
    }

    public void stop() {
        playerState.stop();
    }

    public void pause() {
        playerState.pause();
    }
}
