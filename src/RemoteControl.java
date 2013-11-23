
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
            light.on();
        if (slot == 2)
            ceiling.high();
        if (slot == 3)
        {
            stereo.on();
            stereo.setCd();
            stereo.setVolume(11);
        }
    }

    public void off(int slot)
    {
        if (slot == 1)
            light.off();
        if (slot == 2)
            ceiling.off();
        if (slot == 3)
            stereo.off();
    }
}
