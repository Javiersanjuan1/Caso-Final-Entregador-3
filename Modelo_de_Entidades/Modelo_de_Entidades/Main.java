import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Clase base para organismos
class Organismo {
    protected int posicionX;
    protected int posicionY;
    protected int salud;
    protected int edad;
    protected boolean estadoReproductivo;

    // Constructor
    public Organismo(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.salud = salud;
        this.edad = edad;
        this.estadoReproductivo = estadoReproductivo;
    }

    // Métodos getter y setter
    // ...

    // Método para actualizar la salud del organismo
    public void actualizarSalud(int cantidad) {
        this.salud += cantidad;
        if (this.salud <= 0) {
            // El organismo muere
            // Implementar lógica de muerte según tu necesidad
        }
    }

    // Otros métodos relevantes para los organismos
    // ...
}

// Clase para plantas
class Planta extends Organismo {
    // Constructor
    public Planta(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
    }

    // Otros métodos específicos para plantas
    // ...
}

// Clase para animales
class Animal extends Organismo {
    // Constructor
    public Animal(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
    }

    // Otros métodos específicos para animales
    // ...
}

// Clase para el ambiente
class Ambiente {
    private String clima;
    private String terreno;
    private List<String> recursosDisponibles;

    // Constructor
    public Ambiente(String clima, String terreno) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = new ArrayList<>();
    }

    // Métodos getter y setter
    // ...

    // Método para añadir recursos al ambiente
    public void agregarRecurso(String recurso) {
        this.recursosDisponibles.add(recurso);
    }

    // Otros métodos relevantes para el ambiente
    // ...

    // Método para simular la interacción de predación
    public void predacion(Animal depredador, Animal presa) {
        // Implementar la lógica de predación
    }

    // Método para simular la competencia por recursos
    public void competencia(List<Animal> animales, List<Planta> plantas) {
        // Implementar la lógica de competencia por recursos
    }

    // Método para simular la polinización
    public void polinizacion(Planta planta1, Planta planta2) {
        // Implementar la lógica de polinización
    }
}

public class Main {
    public static void main(String[] args) {
        Ambiente ambiente = new Ambiente("Templado", "Bosque");

        ambiente.agregarRecurso("Agua");
        ambiente.agregarRecurso("Sol");

        // Crear organismos
        Animal leon = new Animal(10, 10, 100, 5, true);
        Animal cebra = new Animal(20, 20, 80, 4, true);
        Planta rosa = new Planta(5, 5, 50, 2, true);
        Planta girasol = new Planta(15, 15, 60, 3, true);

        // Simular interacciones
        ambiente.predacion(leon, cebra);
        ambiente.competencia(List.of(leon, cebra), List.of(rosa, girasol));
        ambiente.polinizacion(rosa, girasol);
    }
}
