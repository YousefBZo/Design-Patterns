/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package state_design_pattern;

/**
 *
 * @author Yousef
 */
public abstract class IPlayerState {

    MediaPlayer mp;

    public IPlayerState(MediaPlayer mp) {
        this.mp = mp;
    }

    public abstract void load();

    public abstract void unload();

    public abstract void play();

    public abstract void stop();

    public abstract void pause();

}
