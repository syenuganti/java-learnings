package structural.facade;

// Facade for the home theater system
public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Amplifier amplifier;
    private Projector projector;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Amplifier amplifier,
                            Projector projector, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.projector = projector;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.setWideScreenMode();
        amplifier.on();
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.stop();
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        lights.brighten();
    }

    public void listenToMusic() {
        System.out.println("Setting up for music...");
        lights.dim(20);
        amplifier.on();
        amplifier.setVolume(12);
        // Additional music setup...
    }
}
