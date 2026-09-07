
/* DIFICULTAD EXTRA (opcional):
* Crea una agenda de contactos por terminal.
* - Debes implementar funcionalidades de búsqueda, inserción, actualización
*   y eliminación de contactos.
* - Cada contacto debe tener un nombre y un número de teléfono.
* - El programa solicita en primer lugar cuál es la operación que se quiere realizar,
*   y a continuación los datos necesarios para llevarla a cabo.
* - El programa no puede dejar introducir números de teléfono no numéricos y con más
*   de 11 dígitos (o el número de dígitos que quieras).
* - También se debe proponer una operación de finalización del programa.*/
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;



public class ejercicio03_DificultadExtra {
    private static Map<String, String> agenda = new HashMap<>();
    public static void main(String[] args) {
        int opcion = -1;
        Scanner scan = new Scanner(System.in);
        while (opcion != 0) {
            System.out.println("----MENU----");
            System.out.println("Pulse un numero para acceder al recurso que necesite");
            System.out.println("1. Añadir usuario");
            System.out.println("2. Buscar usuario");
            System.out.println("3. Actualizar usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("0. Salir");
            opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Añadir usuario: ");
                    añadirUsuario();
                    break;
                case 2:
                    System.out.println("Buscar usuario por nombre: ");
                    String nombreAñadir = scan.nextLine();
                    buscarUsuario(nombreAñadir);
                    break;
                case 3:
                    System.out.println("Actualizar nombre: ");
                    String nombreActualizar = scan.nextLine();
                    System.out.println("Actualizar telefono: ");
                    String telefonoActualizar = scan.nextLine();
                    actualizarUsuario(nombreActualizar, telefonoActualizar);
                    break;
                case 4:
                    System.out.println("Usuario a eliminar");
                    System.out.println("Nombre: ");
                    String nombreEliminar = scan.nextLine();
                    eliminarUsuario(nombreEliminar);
                    break;
                case 0:
                    System.out.println("ADIOS ADIOS ADIOS ADIOS"); 
            }
        }
        scan.close();
    }
    public static void añadirUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Telefono: ");
        String telefono = sc.nextLine();
        agenda.put(nombre,telefono);
        sc.close();
    }
    public static void eliminarUsuario(String nombre){
        agenda.remove(nombre);
    }
    public static void actualizarUsuario(String nombre, String telefono){
        agenda.put(nombre, telefono);
    }
    public static void buscarUsuario(String nombre){
        if (agenda.containsKey(nombre)) {
            System.out.println("ESISTE " + agenda.get(nombre));
        } else {
            System.out.println("NO ESISTE :( ");
        }
        agenda.containsKey(nombre);
    }
}
