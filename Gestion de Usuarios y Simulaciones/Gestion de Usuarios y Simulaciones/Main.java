import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Gestion_de_Usuarios_y_Simulaciones {
    // Base de datos simulada para usuarios autorizados
    private static Map<String, String> usuarios = new HashMap<>();

    public static void main(String[] args) {
        Gestion_de_Usuarios_y_Simulaciones app = new Gestion_de_Usuarios_y_Simulaciones();
        app.iniciar();
    }

    // Método para iniciar la aplicación
    public void iniciar() {
        inicializarUsuarios(); // Inicializar la base de datos de usuarios

        // Loop principal de la aplicación
        while (true) {
            // Interfaz de inicio de sesión
            System.out.println("Bienvenido a la aplicación de simulación");
            System.out.print("Ingrese su nombre de usuario: ");
            Scanner scanner = new Scanner(System.in);
            String usuario = scanner.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String contraseña = scanner.nextLine();

            // Verificar credenciales
            if (autenticarUsuario(usuario, contraseña)) {
                System.out.println("Inicio de sesión exitoso. ¡Bienvenido " + usuario + "!");
                // Aquí puedes llamar a la interfaz de usuario principal
                // y manejar las simulaciones y registros.
                // Por simplicidad, aquí simplemente salimos del programa.
                break;
            } else {
                System.out.println("Credenciales incorrectas. Inténtelo de nuevo.");
            }
        }
    }

    // Método para inicializar la base de datos de usuarios
    private static void inicializarUsuarios() {
        usuarios.put("usuario1", "contraseña1");
        usuarios.put("usuario2", "contraseña2");
        // Agrega más usuarios según sea necesario
    }

    // Método para autenticar usuarios
    private static boolean autenticarUsuario(String usuario, String contraseña) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contraseña);
    }
}

// Clase Main
public class Main {
    public static void main(String[] args) {
        Gestion_de_Usuarios_y_Simulaciones.main(args);
    }
}

