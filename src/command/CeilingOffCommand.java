package command;

import model.Ceiling;

public class CeilingOffCommand {
    public Ceiling ceiling;

    public CeilingOffCommand(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public void ceilingOff() {
        ceiling.off();
    }
}
