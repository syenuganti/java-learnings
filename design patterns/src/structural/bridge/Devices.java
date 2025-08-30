package structural.bridge;

// Concrete implementations
class TV implements Device {
    private boolean enabled = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
        System.out.println("TV turned on");
    }

    @Override
    public void disable() {
        enabled = false;
        System.out.println("TV turned off");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
        System.out.println("TV volume set to: " + this.volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("TV channel set to: " + this.channel);
    }
}

class Radio implements Device {
    private boolean enabled = false;
    private int volume = 20;
    private int channel = 88;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
        System.out.println("Radio turned on");
    }

    @Override
    public void disable() {
        enabled = false;
        System.out.println("Radio turned off");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
        System.out.println("Radio volume set to: " + this.volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Radio frequency set to: " + this.channel + " MHz");
    }
}
