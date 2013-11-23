package command;

import model.Ceiling;

public class CeilingHighCommand implements ICommand {
    public Ceiling ceiling;

    public CeilingHighCommand(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    @Override
    public void execute() {
        ceiling.high();
    }
}
