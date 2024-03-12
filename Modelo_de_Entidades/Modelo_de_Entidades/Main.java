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


    public void actualizarSalud(int cantidad) {
        this.salud += cantidad;
        if (this.salud <= 0) {
        }
    }
}

class Planta extends Organismo {
    // Constructor
    public Planta(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
    }

}

class Animal extends Organismo {
    // Constructor
    public Animal(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
    }
}
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
    public void agregarRecurso(String recurso) {
        this.recursosDisponibles.add(recurso);
    }
    public void predacion(Animal depredador, Animal presa) {
    }

    public void competencia(List<Animal> animales, List<Planta> plantas) {
    }

    public void polinizacion(Planta planta1, Planta planta2) {
    }
}

public class Main {
    public static void main(String[] args) {
        Ambiente ambiente = new Ambiente("Templado", "Bosque");

        ambiente.agregarRecurso("Agua");
        ambiente.agregarRecurso("Sol");

        Animal leon = new Animal(10, 10, 100, 5, true);
        Animal cebra = new Animal(20, 20, 80, 4, true);
        Planta rosa = new Planta(5, 5, 50, 2, true);
        Planta girasol = new Planta(15, 15, 60, 3, true);

        ambiente.predacion(leon, cebra);
        ambiente.competencia(List.of(leon, cebra), List.of(rosa, girasol));
        ambiente.polinizacion(rosa, girasol);
    }
}
