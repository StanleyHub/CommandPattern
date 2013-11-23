package command;

import model.Ceiling;

public class CeilingHighCommand {
    public Ceiling ceiling;

    public CeilingHighCommand(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public void ceilingHigh() {
        ceiling.high();
    }
}
