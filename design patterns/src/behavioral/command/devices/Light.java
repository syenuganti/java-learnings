package behavioral.command.devices;

/**
 * Light device - represents a smart light that can be controlled
 */
public class Light {
    private boolean isOn = false;
    private int intensity = 100;
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(location + " light is turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(location + " light is turned off");
    }

    public void dim(int level) {
        this.intensity = level;
        System.out.println(location + " light intensity set to " + level + "%");
    }

    public boolean isOn() {
        return isOn;
    }

    public int getIntensity() {
        return intensity;
    }
}
