import command.*;
import model.Ceiling;
import model.Light;
import model.Stereo;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {

    private final Map<Integer,ICommand> onCommands = new HashMap<Integer, ICommand>();
    private final Map<Integer,ICommand> offCommands = new HashMap<Integer, ICommand>();

    public RemoteControl(Light light, Ceiling ceiling, Stereo stereo)
    {
        setOnCommand(1, new LightOnCommand(light));
        setOnCommand(2, new CeilingHighCommand(ceiling));
        setOnCommand(3, new StereoOnCommand(stereo));

        setOffCommand(1, new LightOffCommand(light));
        setOffCommand(2, new CeilingOffCommand(ceiling));
        setOffCommand(3, new StereoOffCommand(stereo));

    }

    public void on(int slot)
    {
        onCommands.get(slot).execute();
    }

    private void setOnCommand(int slot, ICommand lightOnCommand) {
        onCommands.put(slot, lightOnCommand);
    }

    public void off(int slot)
    {
        offCommands.get(slot).execute();
    }

    private void setOffCommand(int slot, ICommand lightOffCommand) {
        offCommands.put(slot, lightOffCommand);
    }
}
