package command;

import model.Light;

public class LightOnCommand {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void lightOn() {
        light.on();
    }
}
