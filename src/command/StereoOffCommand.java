package command;

import model.Stereo;

public class StereoOffCommand {
    public Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void stereoOff() {
        stereo.off();
    }
}
