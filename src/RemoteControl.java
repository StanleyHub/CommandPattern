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
    private final Map<Integer,ICommand> getOnCommands;
    private final Map<Integer,ICommand> getOffCommands;
    private final Map<Integer,ICommand> onCommands = new HashMap<Integer, ICommand>();
    private final Map<Integer,ICommand> offCommands = new HashMap<Integer, ICommand>();

    public RemoteControl(Light light, Ceiling ceiling, Stereo stereo)
    {
        this.light = light;
        this.ceiling = ceiling;
        this.stereo = stereo;
        getOnCommands = getOnCommands();
        getOffCommands = getOffCommands();
    }

    public void on(int slot)
    {
        getOnCommands.get(slot).execute();
    }

    private Map<Integer, ICommand> getOnCommands() {
        setOnCommand(1, new LightOnCommand(light));
        setOnCommand(2, new CeilingHighCommand(ceiling));
        setOnCommand(3, new StereoOnCommand(stereo));

        return onCommands;
    }

    private void setOnCommand(int slot, ICommand lightOnCommand) {
        onCommands.put(slot, lightOnCommand);
    }

    public void off(int slot)
    {
        getOffCommands.get(slot).execute();
    }

    private Map<Integer, ICommand> getOffCommands() {
        setOffCommand(1, new LightOffCommand(light));
        setOffCommand(2, new CeilingOffCommand(ceiling));
        setOffCommand(3, new StereoOffCommand(stereo));

        return offCommands;
    }

    private void setOffCommand(int slot, ICommand lightOffCommand) {
        offCommands.put(slot, lightOffCommand);
    }
}
