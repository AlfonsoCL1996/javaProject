/*
 * EJERCICIO:
 * - Muestra ejemplos de creación de todas las estructuras soportadas por defecto
 *   en tu lenguaje.
 * - Utiliza operaciones de inserción, borrado, actualización y ordenación...
 */

import java.util.Arrays;             // Clase utilitaria con metodos estaticos para arrays (ej. sort())
import java.util.Deque;               // Interfaz para pilas/colas de doble extremo
import java.util.List;                // Interfaz: lista ordenada, permite duplicados
import java.util.ArrayDeque;          // Clase concreta que implementa Deque
import java.util.ArrayList;           // Clase concreta que implementa List
import java.util.Set;                 // Interfaz: conjunto, sin duplicados
import java.util.HashSet;             // Clase concreta que implementa Set, sin orden garantizado
import java.util.TreeSet;             // Clase concreta que implementa Set, orden ascendente automatico
import java.util.Map;                 // Interfaz: pares clave-valor, claves unicas
import java.util.HashMap;             // Clase concreta que implementa Map, sin orden garantizado
import java.util.Queue;               // Interfaz: cola FIFO (primero en entrar, primero en salir)
import java.util.LinkedList;          // Clase concreta que implementa List, Queue y Deque a la vez
import java.util.LinkedHashSet;       // Clase concreta que implementa Set manteniendo orden de insercion
import java.util.TreeMap;             // Clase concreta que implementa Map ordenado por clave
import java.util.LinkedHashMap;       // Clase concreta que implementa Map manteniendo orden de insercion
import java.util.PriorityQueue;       // Clase concreta que implementa Queue ordenando por prioridad
import java.util.Scanner;             // Clase para recoger datos por terminal

public class ejercicio03 {

    private static Map<String, String> agenda = new HashMap<>();
    public static void main(String[] args) {
        //ESTRUCTURAS DE DATOS EN JAVA
        // Unidimensional
        int[] vector = {10, 20, 30};
        int primero = vector[0];
        System.out.println(primero);
        vector[1] = 99;              // Actualización
        System.out.println(vector.length);

        // Multidimensional
        int[][] matriz = {{1, 2}, {3, 4}};
        System.out.println(matriz[1][0]); // 3

        // Recorrido
        for (int n : vector) { System.out.println(n); }

        // Ordenación
        Arrays.sort(vector);

        // List<String>: variable de tipo List (interfaz), instanciada con ArrayList (clase concreta)
        List<String> lista = new ArrayList<>();

        lista.add("Ana");                // Inserción
        lista.add(1, "Pedro");           // Inserción en posición concreta
        lista.set(0, "Sofía");           // Actualización
        lista.remove("Pedro");           // Borrado por valor
        lista.remove(0);                 // Borrado por índice
        lista.get(0);                    // Acceso
        lista.size();                    // Tamaño

        java.util.Collections.sort(lista); // Ordenación

        // Set<Integer>: variable de tipo Set (interfaz), instanciada con HashSet (clase concreta)
        Set<Integer> hs = new HashSet<>();   // sin orden garantizado
        hs.add(10);
        hs.remove(10);
        hs.contains(10);

        // Set<Integer>: misma interfaz Set, pero instanciada con TreeSet (clase concreta distinta)
        Set<Integer> ts = new TreeSet<>();   // orden ascendente automático
        ts.add(5); ts.add(1); ts.add(3);     // se recorre ya ordenado: 1, 3, 5

        // Map<String, Integer>: variable de tipo Map (interfaz), instanciada con HashMap (clase concreta)
        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Ana", 25);              // Inserción/Actualización
        mapa.get("Ana");                  // Acceso
        mapa.remove("Ana");               // Borrado
        mapa.containsKey("Ana");          // Verificación
        mapa.size();

        for (Map.Entry<String, Integer> e : mapa.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        // Queue<Integer>: variable de tipo Queue (interfaz), instanciada con LinkedList (clase concreta)
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(1);       // Encolar
        cola.offer(2);
        cola.poll();          // Desencolar (devuelve y quita el primero)
        cola.peek();          // Ver el primero sin quitarlo

        // Deque<Integer>: variable de tipo Deque (interfaz), instanciada con ArrayDeque (clase concreta)
        Deque<Integer> pila = new ArrayDeque<>();
        pila.push(1);         // Apilar
        pila.push(2);
        pila.pop();            // Desapilar
        pila.peek();            // Ver la cima sin quitar
        String s = "Hola Mundo";
        s.length();
        s.charAt(0);
        s.substring(0, 4);
        s.toUpperCase();

        StringBuilder sb = new StringBuilder();
        sb.append("Hola");
        sb.append(" Mundo");
        String resultado = sb.toString();
        System.out.println(resultado);

        //OTRAS CLASES CONCRETAS QUE IMPLEMENTAN LAS MISMAS INTERFACES

        // List -> también existe LinkedList (no solo ArrayList)
        List<String> listaEnlazada = new LinkedList<>();
        listaEnlazada.add("Luis");

        // Set -> también existen LinkedHashSet (mantiene orden de inserción)
        Set<String> lhs = new LinkedHashSet<>();
        lhs.add("Marta");
        lhs.add("Jorge");

        // Map -> también existen TreeMap (ordenado por clave) y LinkedHashMap (orden de inserción)
        Map<String, Integer> tm = new TreeMap<>();
        tm.put("Zoe", 30);
        tm.put("Ana", 25); // al recorrerlo saldría Ana antes que Zoe, orden alfabético

        Map<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Zoe", 30);
        lhm.put("Ana", 25); // al recorrerlo mantiene el orden en que se insertaron

        // Queue -> también existe PriorityQueue (ordena por prioridad, no por orden de llegada)
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(1);
        pq.offer(3); // al hacer poll() saldría primero el 1 (el menor)

        // Deque -> LinkedList también implementa Deque, además de List
        Deque<Integer> pilaConLinkedList = new LinkedList<>();
        pilaConLinkedList.push(1);

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

class Nodo<T> {
    private T info;
    private Nodo<T> ref;
    public Nodo(T info) { this.info = info; this.ref = null; }
    public T getInfo() { return info; }
    public void setRef(Nodo<T> ref) { this.ref = ref; }
    public Nodo<T> getRef() { return ref; }
}