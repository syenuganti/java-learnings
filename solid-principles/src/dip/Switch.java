package dip;

// Bad example - violates DIP
class LightBulb {
    public void turnOn() {
        // Turn on the bulb
    }

    public void turnOff() {
        // Turn off the bulb
    }
}

class SwitchWithoutDIP {
    private LightBulb bulb;  // High-level module depends on low-level module

    public SwitchWithoutDIP() {
        this.bulb = new LightBulb();  // Direct dependency
    }

    public void operate() {
        // Some logic to determine if we need to turn on or off
        bulb.turnOn();
    }
}

// Good example - follows DIP
interface Switchable {
    void turnOn();
    void turnOff();
}

class ModernLightBulb implements Switchable {
    @Override
    public void turnOn() {
        // Turn on the bulb
    }

    @Override
    public void turnOff() {
        // Turn off the bulb
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        // Turn on the fan
    }

    @Override
    public void turnOff() {
        // Turn off the fan
    }
}

class Switch {
    private Switchable device;  // Depends on abstraction

    public Switch(Switchable device) {  // Dependency injection
        this.device = device;
    }

    public void operate() {
        // Some logic to determine if we need to turn on or off
        device.turnOn();
    }
}
