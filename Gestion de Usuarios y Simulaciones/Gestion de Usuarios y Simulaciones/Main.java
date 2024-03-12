import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Gestion_de_Usuarios_y_Simulaciones {
    private static Map<String, String> usuarios = new HashMap<>();

    public static void main(String[] args) {
        Gestion_de_Usuarios_y_Simulaciones app = new Gestion_de_Usuarios_y_Simulaciones();
        app.iniciar();
    }

    public void iniciar() {
        inicializarUsuarios();
        while (true) {
            System.out.println("Bienvenido a la aplicación de simulación");
            System.out.print("Ingrese su nombre de usuario: ");
            Scanner scanner = new Scanner(System.in);
            String usuario = scanner.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String contraseña = scanner.nextLine();

            if (autenticarUsuario(usuario, contraseña)) {
                System.out.println("Inicio de sesión exitoso. ¡Bienvenido " + usuario + "!");
                break;
            } else {
                System.out.println("Credenciales incorrectas. Inténtelo de nuevo.");
            }
        }
    }

    private static void inicializarUsuarios() {
        usuarios.put("usuario1", "contraseña1");
        usuarios.put("usuario2", "contraseña2");
    }

    private static boolean autenticarUsuario(String usuario, String contraseña) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contraseña);
    }
}

public class Main {
    public static void main(String[] args) {
        Gestion_de_Usuarios_y_Simulaciones.main(args);
    }
}

