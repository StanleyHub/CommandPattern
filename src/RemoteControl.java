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
    private final Map<Integer,ICommand> onCommands;
    private final Map<Integer,ICommand> offCommands;
    private final Map<Integer,ICommand> onCommands1 = new HashMap<Integer, ICommand>();
    private final Map<Integer,ICommand> offCommands1 = new HashMap<Integer, ICommand>();

    public RemoteControl(Light light, Ceiling ceiling, Stereo stereo)
    {
        this.light = light;
        this.ceiling = ceiling;
        this.stereo = stereo;
        onCommands = getOnCommands();
        offCommands = getOffCommands();
    }

    public void on(int slot)
    {
        onCommands.get(slot).execute();
    }

    private Map<Integer, ICommand> getOnCommands() {
        setOnCommand(1, new LightOnCommand(light));
        setOnCommand(2, new CeilingHighCommand(ceiling));
        setOnCommand(3, new StereoOnCommand(stereo));

        return onCommands1;
    }

    private void setOnCommand(int slot, ICommand lightOnCommand) {
        onCommands1.put(slot, lightOnCommand);
    }

    public void off(int slot)
    {
        offCommands.get(slot).execute();
    }

    private Map<Integer, ICommand> getOffCommands() {
        setOffCommand(1, new LightOffCommand(light));
        setOffCommand(2, new CeilingOffCommand(ceiling));
        setOffCommand(3, new StereoOffCommand(stereo));

        return offCommands1;
    }

    private void setOffCommand(int slot, ICommand lightOffCommand) {
        offCommands1.put(slot, lightOffCommand);
    }
}
