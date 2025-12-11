public class HomeTheaterFacade {
    private Amplifier amp;
    private Projector projector;
    private Lights lights;

    public HomeTheaterFacade(Amplifier amp, Projector projector, Lights lights) {
        this.amp = amp;
        this.projector = projector;
        this.lights = lights;
    }

    public void watchMovie() {
        System.out.println("--- Preparando todo para ver la película ---");
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setVolume(5);
        System.out.println("¡Película lista para reproducir!");
    }

    public void endMovie() {
        System.out.println("\n--- Apagando el cine en casa ---");
        lights.on();
        amp.off();
        projector.off();
    }
}
