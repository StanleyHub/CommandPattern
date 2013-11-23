package model;

public class Stereo {

    private boolean stereoStatus;
    private boolean cdStatus;
    private int volume;

    public void on()
    {
        stereoStatus = true;
    }

    public void off()
    {
        stereoStatus = false;
        cdStatus = false;
        volume = 0;
    }

    public void setCd()
    {
        cdStatus = true;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    public boolean getStereoStatus() {
        return stereoStatus;
    }

    public boolean getCdStatus() {
        return cdStatus;
    }

    public int getVolume() {
        return volume;
    }
}
