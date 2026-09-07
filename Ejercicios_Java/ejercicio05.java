/*
 * EJERCICIO:
 * - Muestra ejemplos de asignación de variables "por valor" y "por referencia", según
 *   su tipo de dato.
 * - Muestra ejemplos de funciones con variables que se les pasan "por valor" y 
 *   "por referencia", y cómo se comportan en cada caso en el momento de ser modificadas.
 * (Entender estos conceptos es algo esencial en la gran mayoría de lenguajes)
 */

public class ejercicio05 {
    
    public static void main(String[] args) {
        
        // ============================================================
        // 1. ASIGNACIÓN POR VALOR (Tipos primitivos)
        // ============================================================
        // Los tipos primitivos (int, double, boolean, char, etc.) 
        // almacenan el valor directamente en la variable.
        
        int a = 10;          // 'a' contiene el valor 10
        int b = a;           // 'b' recibe UNA COPIA del valor de 'a' (10)
        
        System.out.println("=== ASIGNACIÓN POR VALOR ===");
        System.out.println("Antes de modificar b:");
        System.out.println("a = " + a);  // 10
        System.out.println("b = " + b);  // 10
        
        b = 20;              // Modificamos b, pero a NO se ve afectada
        
        System.out.println("Después de modificar b:");
        System.out.println("a = " + a);  // 10 (sigue igual)
        System.out.println("b = " + b);  // 20 (solo b cambió)
        
        // ============================================================
        // 2. ASIGNACIÓN POR REFERENCIA (Objetos)
        // ============================================================
        // Los objetos (arrays, String, clases, etc.) almacenan 
        // una REFERENCIA a la posición en memoria donde está el objeto..
        
        int[] array1 = {1, 2, 3};  // array1 guarda la dirección de memoria del array
        int[] array2 = array1;     // array2 recibe LA MISMA referencia (apunta al mismo array)
        
        System.out.println("\n=== ASIGNACIÓN POR REFERENCIA ===");
        System.out.println("Antes de modificar array2:");
        System.out.println("array1[0] = " + array1[0]);  // 1
        System.out.println("array2[0] = " + array2[0]);  // 1
        
        array2[0] = 999;          // Modificamos array2, pero como apunta al mismo objeto...
        
        System.out.println("Después de modificar array2:");
        System.out.println("array1[0] = " + array1[0]);  // 999 (¡cambió también!)
        System.out.println("array2[0] = " + array2[0]);  // 999
        
        // ============================================================
        // 3. PASO POR VALOR EN FUNCIONES (primitivos)
        // ============================================================
        // Cuando pasamos un primitivo a un método, se pasa UNA COPIA.
        // El método recibe su propia copia y las modificaciones NO afectan al original.
        
        System.out.println("\n=== PASO POR VALOR EN FUNCIONES (primitivos) ===");
        int numeroOriginal = 5;
        System.out.println("Antes de llamar a modificarValor: " + numeroOriginal);  // 5
        
        modificarValor(numeroOriginal);
        
        System.out.println("Después de llamar a modificarValor: " + numeroOriginal);  // 5 (¡sigue igual!)
        
        // ============================================================
        // 4. PASO POR REFERENCIA EN FUNCIONES (objetos)
        // ============================================================
        // Cuando pasamos un objeto a un método, se pasa LA REFERENCIA.
        // El método recibe la misma referencia y las modificaciones SÍ afectan al objeto original.
        
        System.out.println("\n=== PASO POR REFERENCIA EN FUNCIONES (objetos) ===");
        int[] arrayOriginal = {1, 2, 3};
        System.out.println("Antes de llamar a modificarReferencia: " + arrayOriginal[0]);  // 1
        
        modificarReferencia(arrayOriginal);
        
        System.out.println("Después de llamar a modificarReferencia: " + arrayOriginal[0]);  // 999 (¡cambió!)
    }
    
    // ============================================================
    // EJEMPLO DE FUNCIÓN CON PASO POR VALOR
    // ============================================================
    // Recibe UNA COPIA del valor original. La modificación solo afecta a la copia local.
    public static void modificarValor(int numero) {
        System.out.println("  Dentro del método (antes de modificar): " + numero);  // 5
        numero = 100;  // Modificamos la copia local
        System.out.println("  Dentro del método (después de modificar): " + numero);  // 100
        // Al salir, la copia se destruye. El original NO cambia.
    }
    
    // ============================================================
    // EJEMPLO DE FUNCIÓN CON PASO POR REFERENCIA
    // ============================================================
    // Recibe LA REFERENCIA al objeto original. La modificación afecta al objeto original.
    public static void modificarReferencia(int[] array) {
        System.out.println("  Dentro del método (antes de modificar): " + array[0]);  // 1
        array[0] = 999;  // Modificamos el objeto a través de la referencia
        System.out.println("  Dentro del método (después de modificar): " + array[0]);  // 999
        // Al salir, la referencia local se destruye, pero el objeto original ya fue modificado.
    }
}