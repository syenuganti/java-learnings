package behavioral.command.devices;

/**
 * Thermostat device - represents a smart thermostat that can be controlled
 */
public class Thermostat {
    private boolean isOn = false;
    private int temperature = 22; // Default temperature in Celsius

    public void turnOn() {
        isOn = true;
        System.out.println("Thermostat turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Thermostat turned off");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature + "°C");
    }

    public int getTemperature() {
        return temperature;
    }

    public boolean isOn() {
        return isOn;
    }
}
