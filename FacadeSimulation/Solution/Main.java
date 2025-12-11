public class Main {
    public static void main(String[] args) {
        // Crear los componentes
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();
        Lights lights = new Lights();

        // Crear la fachada
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, projector, lights);

        // Usar la interfaz simple
        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}
