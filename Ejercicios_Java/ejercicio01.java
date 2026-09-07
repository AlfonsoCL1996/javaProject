/*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */


public class ejercicio01 {
    public static void main(String[] args) {
        //Operadores
        //Aritmeticos
        System.out.println("Suma 1+1 = " + (1+1));              //Suma
        System.out.println("Resta 1-1 = " + (1-1));             //Resta
        System.out.println("Multiplicacion 2*1 = " + (2*1));    //Multiplicacion
        System.out.println("Division 10/2 = " + (10/2));        //Division
        System.out.println("Resto de 10/2 = " + (10%2));        //Resto
        int contador = 10;                                      //Contador para incrementos y decrementos
        System.out.println("Incremento posfijo++ de 10 = " + contador++);   //Inc posfijo
        System.out.println("Incremento ++prefijo de 10 = " + ++contador);   //Inc prefijo
        System.out.println("Decremento posfijo-- de 10 = " + contador--);   //Dec posfijo
        System.out.println("Decremento --prefijo de 10 = " + --contador);   //Dec prefijo
        //Relacionales
        int a = 1, b = 0;                                               //Variables a relacionar
        System.out.println("Comparacion a=1 == b=0? " + (a==b));        //Igualdad
        System.out.println("Diferencia a=1 != b=0 " + (a!=b));          //Desigualdad
        System.out.println("Es a=1 mayor que b=0? " + (a>b));           //Mayor que
        System.out.println("Es a=1 mayor o igual que b=0? " + (a>=b));  //Mayor o igual que
        System.out.println("Es a=1 menor que b=0? " + (a<b));           //Menor que
        System.out.println("Es a=1 menor o igual que b=0? " + (a<=b));  //Menor o igual que
        //Logicos
        boolean x = true, z = false;                                            //Condiciones booleanas
        System.out.println("x=true AND&& z=false? " + (x && z)); // AND         //AND cortocircuito
        System.out.println("x OR z? " + (x || z)); // OR                        //OR
        System.out.println("z NOT " + (!z));     // NOT                         //NOT
        System.out.println("x AND& z? " + (x & z));  // AND (sin cortocircuito) //AND sin cortocircuito
        System.out.println("x OR z " + (x | z));  // OR (sin cortocircuito)     //OR sin cortocircuito
        System.out.println("x XOR z? " + (x ^ z));  // XOR                      //XOR
        //Asignacion
        int i=5;
        System.out.println("5+1= " + (i+=1));
        System.out.println("5-1= " + (i-=1));
        System.out.println("5*1= " + (i*=1));
        System.out.println("5/1= " + (i/=1));
        System.out.println("5%1= " + (i%=1));
        System.out.println("5&1= " + (i&=1));
        System.out.println("5|1= " + (i|=1));
        System.out.println("5^1= " + (i^=1));
        System.out.println("5<<1= " + (i<<=1));
        System.out.println("5>>1= " + (i>>=1));
        System.out.println("5>>>1= " + (i>>>=1));

        //Bitwise, operador ternario y especialidades...
        int q = 5, w = 3; // 0101, 0011
        System.out.println(q & w);  // AND bit a bit -> 1
        System.out.println(q | w);  // OR bit a bit  -> 7
        System.out.println(q ^ w);  // XOR bit a bit -> 6
        System.out.println(~q);     // Complemento   -> -6
        System.out.println(q << 1); // Desplaza izq. -> 10
        System.out.println(q >> 1); // Desplaza der. -> 2

        int edad = 20;
        String resultado = (edad >= 18) ? "Mayor" : "Menor";
        System.out.println(resultado);
        
        Object obj = new String("Hola");     // new
        boolean esString = obj instanceof String; // instanceof
        double d = 9.7;
        int p = (int) d;                     // cast, p = 9
        System.out.println(obj.toString());  // operador punto
        System.out.println(esString);
        System.out.println(p);
        
        //Estructuras de control
        //Condicionales if, if-else, if-else-if
        int condicion1 = 1, condicion2 = 2, condicion3 = 3;
        if (condicion1 != condicion2) {
            System.out.println(condicion1);
        }

        if (condicion1 == condicion2) {
            System.out.println("Condicion 1 es igual a condicion 2");
        } else {
            System.out.println("Condicion 1 es diferente a condicion 2");
        }

        if (condicion1 >= condicion3) {
            System.out.println("Condicion 1 es mayor o igual a condicion 3");
        } else if (condicion1 <= condicion3) {
            System.out.println("Condicion 1 es menor o igual a condicion 3");
        } else {
            System.out.println("Condicion 1 y condicion 3 no se pueden relacionar");
        }

        //switch
        String[] miDia = {"Lunes","Martes","Mierdoles","Jueves","Viernes"};
        int opcion = 1;
        switch (opcion) {
            case 1: System.out.println(miDia[0]); break;
            case 2: System.out.println(miDia[1]); break;
            case 3: System.out.println(miDia[2]); break;
            case 4: System.out.println(miDia[3]); break;
            case 5: System.out.println(miDia[4]); break;
        }
        
        //while
        int v = 0;
        while (v < 3) { System.out.println(v); v++; }

        //do-while
        int j = 0;
        do { System.out.println(j); j++; } while (j < 3);

        //for
        for (int k = 0; k < 3; k++) { System.out.println(k); }
        //for avanzado
        int[] arr = {1, 2, 3};
        for (int n : arr) { System.out.println(n); }

        //try-catch-finally, control de flujo para gestion de excepciones
        try {
            int f = 10 / 0;
            System.out.println("f 10/0 a juicio" + f);      //Nunca se va a ejecutar porque 10/0 se ejecuta como un error que recoge directamente catch, sin ejecutarse el bloque try
        } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
        } finally {
        System.out.println("Fin");
        }
        
        //Crea un programa que imprima por consola todos los números comprendidos
        //entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
        for (int s=10; s<=55; s++) {
            if (s%2==0 && s%3!=0 && s!=16) {
                System.out.println(s);
            }
        }
    }
}
