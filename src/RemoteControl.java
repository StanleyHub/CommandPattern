
import command.*;
import model.Ceiling;
import model.Light;
import model.Stereo;

public class RemoteControl {

    private Light light;
    private Ceiling ceiling;
    private Stereo stereo;

    public RemoteControl(Light light, Ceiling ceiling, Stereo stereo)
    {
        this.light = light;
        this.ceiling = ceiling;
        this.stereo = stereo;
    }

    public void on(int slot)
    {
        if (slot == 1)
            new LightOnCommand(light).lightOn();
        if (slot == 2)
            new CeilingHighCommand(ceiling).ceilingHigh();
        if (slot == 3)
        {
            new StereoOnCommand(stereo).stereoOn();
        }
    }

    public void off(int slot)
    {
        if (slot == 1)
            new LightOffCommand(light).lightOff();
        if (slot == 2)
            new CeilingOffCommand(ceiling).ceilingOff();
        if (slot == 3)
            new StereoOffCommand(stereo).stereoOff();
    }
}
