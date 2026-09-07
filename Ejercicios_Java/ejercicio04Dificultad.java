import java.util.Map;
import java.util.HashMap;

public class ejercicio04Dificultad {
    /* DIFICULTAD EXTRA (opcional):
    * Crea un programa que analice dos palabras diferentes y realice comprobaciones
    * para descubrir si son:
    * - Palíndromos: palabras que se leen igual de alante atras que de atras alante
    * - Anagramas: palabras que pueden formar otras palabras a partir de si mismas
    * - Isogramas: palabras que no repiten letras dentro de si mismas.. */

    public static void main(String[] args) {
        String palindromo = "ana";
        String anagrama1 = "amor";
        String anagrama2 = "roma";
        String isograma = "hiperbolico";

        // Es palindromo?
        String reves = "";
        for (int i = palindromo.length() - 1; i >= 0; i--) {
            reves += palindromo.charAt(i);
        }
        if (palindromo.equals(reves)) {
            System.out.println("ES PALINDROMO");
        } else {
            System.out.println("NO ES PALINDROMO");
        }

        // Es anagrama?
        Map<Character, Integer> contador = new HashMap<>();
        
        // Contar caracteres de la primera palabra
        for (int i = 0; i < anagrama1.length(); i++) {
            char c = anagrama1.charAt(i);
            if (contador.containsKey(c)) {
                contador.put(c, contador.get(c) + 1);
            } else {
                contador.put(c, 1);
            }
        }
        
        // Restar caracteres de la segunda palabra
        for (int i = 0; i < anagrama2.length(); i++) {
            char c = anagrama2.charAt(i);
            if (contador.containsKey(c)) {
                contador.put(c, contador.get(c) - 1);
            } else {
                contador.put(c, -1);
            }
        }
        
        // Verificar si todos los valores son 0
        boolean esAnagrama = true;
        for (int valor : contador.values()) {
            if (valor != 0) {
                esAnagrama = false;
                break;
            }
        }
        
        if (esAnagrama) {
            System.out.println("ES ANAGRAMA");
        } else {
            System.out.println("NO ES ANAGRAMA");
        }

        // Es isograma?
        Map<Character, Integer> contadorIsograma = new HashMap<>();
        boolean esIsograma = true;
        
        for (int i = 0; i < isograma.length(); i++) {
            char c = isograma.charAt(i);
            if (contadorIsograma.containsKey(c)) {
                esIsograma = false;
                break;
            } else {
                contadorIsograma.put(c, 1);
            }
        }
        
        if (esIsograma) {
            System.out.println("ES ISOGRAMA");
        } else {
            System.out.println("NO ES ISOGRAMA");
        }
    }
}