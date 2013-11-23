import command.*;
import model.Ceiling;
import model.Light;
import model.Stereo;

import java.util.HashMap;
import java.util.Map;

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
        Map<Integer, ICommand> onCommands = new HashMap<Integer, ICommand>();
        final LightOnCommand lightOnCommand = new LightOnCommand(light);
        final CeilingHighCommand ceilingHighCommand = new CeilingHighCommand(ceiling);
        final StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);

        onCommands.put(1, lightOnCommand);
        onCommands.put(2, ceilingHighCommand);
        onCommands.put(3, stereoOnCommand);

        onCommands.get(slot).execute();
    }

    public void off(int slot)
    {
        Map<Integer, ICommand> offCommands = new HashMap<Integer, ICommand>();
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        CeilingOffCommand ceilingOffCommand = new CeilingOffCommand(ceiling);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        offCommands.put(1, lightOffCommand);
        offCommands.put(2, ceilingOffCommand);
        offCommands.put(3, stereoOffCommand);

        offCommands.get(slot).execute();

    }
}
