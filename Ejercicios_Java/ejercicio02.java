/*
 * EJERCICIO:
 * - Crea ejemplos de funciones básicas que representen las diferentes
 *   posibilidades del lenguaje:
 *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
 * - Comprueba si puedes crear funciones dentro de funciones.
 * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
 * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 *
 * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
 * Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.
 */


public class ejercicio02 {
    //En java las funciones son los metodos.
    //main es el metodo principal que la JVM busca como punto de inicio.
    //La estructura de un metodo es: modificador tipoRetorno nombreMetodo (parametros) {cuerpo; return valor(si no es void);}
    
    public static int miVariableGlobal = 100;

    public static void main(String[] args) {    //public (modificador, si fuera private la JVM no podria llamarlo), static (El metodo pertenece a la clase, no a un objeto, la JVM no puede crear un objeto de clase antes de arrancar el programa), void (Retorno. main no devuelve valor a quien lo llama), main (Nombre fijo, obligatorio para arrancar, es lo que la JVM va a buscar literalmente para ello), String[] args (Parametro, un array de String que recoge los argumentos que se pasan al ejecutar el programa desde terminal. Si no pasas nada al ejecutar args es un array vacio, no null)
        
        int miVariableLocal = 10;
        System.out.println("Mi variable global = " + miVariableGlobal);
        System.out.println("Mi variable Local = " + miVariableLocal);
        System.out.println(sumar(miVariableGlobal, miVariableLocal));


        //Llamada a metodo sin parametros ni retorno
        saludar();

        //Llamada a metodo con parametro sin retorno
        despedirse("Alfredo");

        //Llamada a metodo con parametros y con retorno
        System.out.println(sumar(3 ,4));

        //Llamada a metodo de Ejercicio Adicional
        System.out.println(deUnoaCien("Venezuela", "Colombia"));

        //Metodos propios de java, algunos ejemplos:
        // Math
        System.out.println(Math.max(5, 8));
        System.out.println(Math.min(5, 8));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.abs(-7));
        System.out.println(Math.round(4.6));

        // String
        String s = "Hola Mundo";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.replace("Mundo", "Java"));

        // Integer
        System.out.println(Integer.parseInt("42"));
        System.out.println(Integer.toString(42));
        System.out.println(Integer.MAX_VALUE);

        // System
        System.out.println(System.currentTimeMillis());

        // Character
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isLetter('a'));
    }

    //Metodo sin parametros ni retorno
    public static void saludar() {
        System.out.println("Hola!");
        System.out.println("Desde saludar, la global vale: " + miVariableGlobal);
    }
    //Metodo con paramteros sin retorno
    public static void despedirse(String persona) {
        System.out.println("Adios!" + persona);
    }
    //Metodo con parametros y con retorno
    public static int sumar(int a, int b) {
        return a+b;
    }

    /* * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos. */
    public static int deUnoaCien (String a, String b) {
        int contador = 0;
        for (int i=1; i<=100; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("Primer parametro: " + a + "Segundo parametro: " + b);
            } else if (i%3==0) {
                System.out.println("Primer parametro: " + a);
            } else if (i%5==0) {
                System.out.println("Segundo parametro: " + b);
            } else {
                System.out.println(i);
                contador++;
            }
        }
        return contador;
    }
}
