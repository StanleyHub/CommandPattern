package model;

public class Light {

    private boolean status;

    public void on() {
        status = true;
    }

    public void off() {
        status = false;
    }

    public boolean getStatus() {
        return status;
    }
}
