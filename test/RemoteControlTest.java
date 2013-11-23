import command.*;
import model.Ceiling;
import model.Light;
import model.Stereo;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class RemoteControlTest {

    @Test
    public void should_turn_on_light_when_press_first_on_button()
    {
        Light light = new Light();
        final RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(1, new LightOnCommand(light));

        remoteControl.on(1);
        assertTrue(light.getStatus());
    }

    @Test
    public void should_turn_off_light_when_press_first_off_button()
    {
        Light light = new Light();
        final RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOffCommand(1, new LightOffCommand(light));
        remoteControl.off(1);

        assertFalse(light.getStatus());
    }

    @Test
    public void should_turn_on_ceiling_when_press_second_on_button()
    {
        Ceiling ceiling = new Ceiling();
        final RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(2, new CeilingHighCommand(ceiling));

        remoteControl.on(2);

        assertEquals(Ceiling.CeilingSpeed.High, ceiling.getSpeed());
    }

    @Test
    public void should_turn_off_ceiling_when_press_second_off_button()
    {
        Ceiling ceiling = new Ceiling();
        final RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOffCommand(2, new CeilingOffCommand(ceiling));
        remoteControl.off(2);

        assertEquals(Ceiling.CeilingSpeed.Off, ceiling.getSpeed());
    }

    @Test
    public void should_turn_on_stereo_when_press_third_on_button()
    {
        Stereo stereo = new Stereo();
        final RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(3, new StereoOnCommand(stereo));
        remoteControl.on(3);

        assertTrue(stereo.getStereoStatus());
        assertTrue(stereo.getCdStatus());
        assertEquals(11, stereo.getVolume());
    }

    @Test
    public void should_turn_off_stereo_when_press_third_off_button()
    {
        Stereo stereo = new Stereo();
        final RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOffCommand(3, new StereoOffCommand(stereo));
        remoteControl.off(3);

        assertFalse(stereo.getCdStatus());
        assertFalse(stereo.getStereoStatus());
        assertEquals(0, stereo.getVolume());
    }

}
