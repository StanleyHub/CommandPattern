package command;

import model.Stereo;

public class StereoOffCommand implements ICommand {
    public Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
