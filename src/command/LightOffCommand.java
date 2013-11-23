package command;

import model.Light;

public class LightOffCommand {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void lightOff() {
        light.off();
    }
}
