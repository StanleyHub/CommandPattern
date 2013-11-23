package command;

import model.Stereo;

public class StereoOnCommand {
    public Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void stereoOn() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
