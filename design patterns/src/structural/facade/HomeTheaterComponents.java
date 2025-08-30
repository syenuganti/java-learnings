package structural.facade;

// Complex subsystem components
class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is on");
    }

    public void off() {
        System.out.println("DVD Player is off");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("DVD Player stopped");
    }
}

class Amplifier {
    public void on() {
        System.out.println("Amplifier is on");
    }

    public void off() {
        System.out.println("Amplifier is off");
    }

    public void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }

    public void setSurroundSound() {
        System.out.println("Surround sound enabled");
    }
}

class Projector {
    public void on() {
        System.out.println("Projector is on");
    }

    public void off() {
        System.out.println("Projector is off");
    }

    public void setInput(String input) {
        System.out.println("Setting input to: " + input);
    }

    public void setWideScreenMode() {
        System.out.println("Widescreen mode enabled");
    }
}

class Lights {
    public void dim(int level) {
        System.out.println("Dimming lights to " + level + "%");
    }

    public void brighten() {
        System.out.println("Lights brightened to 100%");
    }
}
