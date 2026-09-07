/*
Declare un array (o ArrayList) con 5 notas (números decimales) de un alumno.
Recorra el array con un bucle y calcule:
La nota media.
La nota más alta y la más baja.
Use condicionales para mostrar si el alumno ha aprobado (media ≥ 5) o no.
Encapsula la lógica en al menos dos métodos distintos (por ejemplo, calcularMedia(double[] notas) y obtenerMaxima(double[] notas)), no todo en el main.
Imprima un resumen final por consola con los resultados.
*/

import java.util.Scanner;

public class Notas_Alumnos {
    public static void main(String[] args) {

        //Instancia de herramienta Scanner
        Scanner sc = new Scanner(System.in);

        //Pedir cantidad de notas
        System.out.println("Cuantas notas va a registrar?");
        int cantidad = sc.nextInt();
        //Declaramos un array del tamaño de la cantidad de notas
        double[] notas = new double[cantidad];
        //Recorremos el array registrando las notas por indices
        for (int i=0; i<cantidad; i++) {
            System.out.println("Nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
        }
        //Cierre de la instancia de Scanner
        sc.close();

        //Llamar a los metodos
        double media = calcularMedia(notas);
        double max = calcularMaxima(notas);
        double min = calcularMinima(notas);

        //Imprimir resultados
        System.out.println(media);
        System.out.println(max);
        System.out.println(min);
    }

    //Metodo calcular la media
    public static double calcularMedia(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma/notas.length;
    }
    //Metodo calcula nota maxima
    public static double calcularMaxima(double[] notas) {
        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) max = nota;
        }
        return max;
    }
    //Metodo calcula nota minima
    public static double calcularMinima(double[] notas) {
        double min = notas[0];
        for (double nota : notas) {
            if (nota < min) min = nota;
        }
        return min;
    }
}