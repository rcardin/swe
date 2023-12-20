package it.unipd.math.swe.patterns.command;

public class Radio {

    public void switchOn() {
        System.out.println("Radio switched on");
    }

    public void switchOff() {
        System.out.println("Radio switched off");
    }

    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }

    public void setChannel(int channel) {
        System.out.println("Channel set to " + channel);
    }
}
