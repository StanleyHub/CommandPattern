import command.*;
import model.Ceiling;
import model.Light;
import model.Stereo;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {

    private final Map<Integer,ICommand> onCommands = new HashMap<Integer, ICommand>();
    private final Map<Integer,ICommand> offCommands = new HashMap<Integer, ICommand>();

    public RemoteControl()
    {
    }

    public void on(int slot)
    {
        onCommands.get(slot).execute();
    }

    public void setOnCommand(int slot, ICommand command) {
        onCommands.put(slot, command);
    }

    public void off(int slot)
    {
        offCommands.get(slot).execute();
    }

    public void setOffCommand(int slot, ICommand command) {
        offCommands.put(slot, command);
    }
}
