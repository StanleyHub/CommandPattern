package command;

import model.Ceiling;

public class CeilingOffCommand implements ICommand {
    public Ceiling ceiling;

    public CeilingOffCommand(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    @Override
    public void execute() {
        ceiling.off();
    }
}
