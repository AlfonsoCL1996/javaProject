/*
 * DIFICULTAD EXTRA (opcional):
 * Crea dos programas que reciban dos parámetros (cada uno) definidos como
 * variables anteriormente.
 * - Cada programa recibe, en un caso, dos parámetros por valor, y en otro caso, por referencia.
 *   Estos parámetros los intercambia entre ellos en su interior, los retorna, y su retorno
 *   se asigna a dos variables diferentes a las originales. A continuación, imprime
 *   el valor de las variables originales y las nuevas, comprobando que se ha invertido
 *   su valor en las segundas.
 *   Comprueba también que se ha conservado el valor original en las primeras..
 */

public class ejercicio05DE {
    
    public static void main(String[] args) {
        
        // ============================================================
        // PROGRAMA 1: INTERCAMBIO POR VALOR (tipos primitivos)
        // ============================================================
        // Definimos dos variables primitivas con valores iniciales
        int valor1 = 10;
        int valor2 = 20;
        
        System.out.println("=== PROGRAMA 1: INTERCAMBIO POR VALOR (primitivos) ===");
        System.out.println("Variables originales antes del intercambio:");
        System.out.println("valor1 = " + valor1);  // 10
        System.out.println("valor2 = " + valor2);  // 20
        
        // Llamamos al método que intercambia por valor
        // Recibe copias de valor1 y valor2, y devuelve un array con los valores intercambiados
        int[] resultado = intercambiarPorValor(valor1, valor2);
        
        // Asignamos los valores retornados a NUEVAS variables (diferentes a las originales)
        int nuevoValor1 = resultado[0];  // Recibe el valor intercambiado (20)
        int nuevoValor2 = resultado[1];  // Recibe el valor intercambiado (10)
        
        System.out.println("\nVariables originales DESPUÉS del intercambio (por valor):");
        System.out.println("valor1 (original) = " + valor1);  // 10 (¡se conserva!)
        System.out.println("valor2 (original) = " + valor2);  // 20 (¡se conserva!)
        
        System.out.println("\nNuevas variables (con valores intercambiados):");
        System.out.println("nuevoValor1 = " + nuevoValor1);  // 20 (intercambiado)
        System.out.println("nuevoValor2 = " + nuevoValor2);  // 10 (intercambiado)
        
        // ============================================================
        // PROGRAMA 2: INTERCAMBIO POR REFERENCIA (objetos)
        // ============================================================
        // Definimos dos variables que son objetos (arrays en este caso)
        // Cada array contiene un valor que queremos intercambiar
        int[] referencia1 = {100};
        int[] referencia2 = {200};
        
        System.out.println("\n=== PROGRAMA 2: INTERCAMBIO POR REFERENCIA (objetos) ===");
        System.out.println("Variables originales antes del intercambio:");
        System.out.println("referencia1[0] = " + referencia1[0]);  // 100
        System.out.println("referencia2[0] = " + referencia2[0]);  // 200
        
        // Llamamos al método que intercambia por referencia
        // Recibe las referencias a los arrays y modifica su contenido
        int[][] resultadoRef = intercambiarPorReferencia(referencia1, referencia2);
        
        // Asignamos las referencias retornadas a NUEVAS variables
        int[] nuevaReferencia1 = resultadoRef[0];  // Recibe la referencia al array con valor intercambiado
        int[] nuevaReferencia2 = resultadoRef[1];  // Recibe la referencia al array con valor intercambiado
        
        System.out.println("\nVariables originales DESPUÉS del intercambio (por referencia):");
        System.out.println("referencia1[0] (original) = " + referencia1[0]);  // 200 (¡cambió!)
        System.out.println("referencia2[0] (original) = " + referencia2[0]);  // 100 (¡cambió!)
        
        System.out.println("\nNuevas variables (con valores intercambiados):");
        System.out.println("nuevaReferencia1[0] = " + nuevaReferencia1[0]);  // 200 (intercambiado)
        System.out.println("nuevaReferencia2[0] = " + nuevaReferencia2[0]);  // 100 (intercambiado)
        
        // COMPROBACIÓN ADICIONAL: ¿nuevaReferencia1 y referencia1 apuntan al mismo objeto?
        System.out.println("\n=== COMPROBACIÓN DE REFERENCIAS ===");
        System.out.println("¿referencia1 y nuevaReferencia1 son el mismo objeto? " + (referencia1 == nuevaReferencia1));  // true
        System.out.println("¿referencia2 y nuevaReferencia2 son el mismo objeto? " + (referencia2 == nuevaReferencia2));  // true
        // Esto demuestra que el método devolvió las mismas referencias que recibió,
        // pero con el contenido intercambiado internamente.
    }
    
    // ============================================================
    // MÉTODO PARA INTERCAMBIO POR VALOR
    // ============================================================
    // Recibe DOS COPIA de los valores originales.
    // Realiza el intercambio internamente y devuelve un array con los valores intercambiados.
    // IMPORTANTE: Las variables originales NO se ven afectadas.
    public static int[] intercambiarPorValor(int a, int b) {
        System.out.println("\n  Dentro del método (intercambio por valor):");
        System.out.println("  Antes del intercambio: a = " + a + ", b = " + b);  // a=10, b=20
        
        // Realizamos el intercambio usando una variable temporal
        int temporal = a;  // Guardamos el valor de 'a' (10)
        a = b;             // 'a' ahora vale 20
        b = temporal;      // 'b' ahora vale 10
        
        System.out.println("  Después del intercambio: a = " + a + ", b = " + b);  // a=20, b=10
        System.out.println("  (Solo las copias locales se intercambiaron)");
        
        // Devolvemos los valores intercambiados en un array
        // Nota: Esto es necesario porque no podemos devolver dos valores primitivos directamente
        return new int[]{a, b};  // Devuelve {20, 10}
    }
    
    // ============================================================
    // MÉTODO PARA INTERCAMBIO POR REFERENCIA
    // ============================================================
    // Recibe LAS REFERENCIAS a los objetos originales.
    // Modifica el contenido de los objetos a través de las referencias.
    // IMPORTANTE: Los objetos originales SÍ se ven afectados.
    public static int[][] intercambiarPorReferencia(int[] arr1, int[] arr2) {
        System.out.println("\n  Dentro del método (intercambio por referencia):");
        System.out.println("  Antes del intercambio: arr1[0] = " + arr1[0] + ", arr2[0] = " + arr2[0]);  // 100, 200
        
        // Realizamos el intercambio de los VALORES dentro de los arrays
        // Como arr1 y arr2 son referencias a los objetos originales, 
        // cualquier modificación afecta a los objetos originales
        int temporal = arr1[0];   // Guardamos el valor de arr1[0] (100)
        arr1[0] = arr2[0];        // arr1[0] ahora vale 200 (modifica el objeto original)
        arr2[0] = temporal;       // arr2[0] ahora vale 100 (modifica el objeto original)
        
        System.out.println("  Después del intercambio: arr1[0] = " + arr1[0] + ", arr2[0] = " + arr2[0]);  // 200, 100
        System.out.println("  (Los objetos originales fueron modificados)");
        
        // Devolvemos las mismas referencias que recibimos (los objetos ya modificados)
        // Es equivalente a devolver arr1 y arr2 directamente
        return new int[][]{arr1, arr2};
    }
}