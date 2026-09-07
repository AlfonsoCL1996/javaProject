/*
 * EJERCICIO:
 * Entiende el concepto de recursividad creando una función recursiva que imprima
 * números del 100 al 0.
 *
 * DIFICULTAD EXTRA (opcional):
 * Utiliza el concepto de recursividad para:
 * - Calcular el factorial de un número concreto (la función recibe ese número).
 * - Calcular el valor de un elemento concreto (según su posición) en la 
 *   sucesión de Fibonacci (la función recibe la posición).
 */

public class ejercicio06 {
    public static void main(String[] args) {
        float numero = 7.5f;
        countDown(10);
    }

    public static int countDown(int number) {
        if (number >=0) {
            System.out.println(number);
            countDown(number - 1);
            return number;
        }
        return -1;
    }
}