public class ejercicio04 {
    
    /*
 * EJERCICIO:
 * Muestra ejemplos de todas las operaciones que puedes realizar con cadenas de caracteres
 * en tu lenguaje. Algunas de esas operaciones podrían ser (busca todas las que puedas):
 * - Acceso a caracteres específicos, subcadenas, longitud, concatenación, repetición,
 *   recorrido, conversión a mayúsculas y minúsculas, reemplazo, división, unión,
 *   interpolación, verificación.....
 */
    public static void main(String[] args) {
        //Declaracion de clase String (Objeto)
        String str1 = "Que pasa pues?";
        System.out.println(str1);

        //Acceso a caracter especifico
        System.out.println(str1.charAt(0));

        //Subcadena
        System.out.println(str1.substring(0,3));

        //Longitud
        System.out.println(str1.length());

        //Concatenacion
        String str2 = "Concate";
        String str3 = "nacioN";
        System.out.println(str2 + str3);
        String str4 = str2.concat(" ").concat(str3);
        System.out.println(str4);

        //Repeticion
        String repeticion = "Repetir";
        System.out.println(repeticion.repeat(10));

        //Recorrer
        String recorrer = "Recorrido";
        for (int i=0; i< recorrer.length(); i++) {
            System.out.println(recorrer.charAt(i));
        }
        for (char c : recorrer.toCharArray()) {
            System.out.println(c);
        }

        //A mayusculas
        String mayusculas = "mayusculas";
        System.out.println(mayusculas.toUpperCase());

        //A minusculas
        String minusculas = "MINUSCULAS";
        System.out.println(minusculas.toLowerCase());

        //Reemplazo
        String reemplazo = "Si quiero comerme una mierda";
        System.out.println(reemplazo.replace("Si","No"));

        //Division
        String dividir = "Me parto";
        System.out.println(dividir.split(" "));

        //Union? Sera quitar espacios o concatenar, que querra decir...
        //Por si acaso, quitar espacios al principio y al final:
        System.out.println(dividir.trim());

        //Comparacion
        String hola = "Hola";
        String ola = "ola";
        System.out.println(hola.equals(ola));

        //Posicion de partida
        System.out.println(reemplazo.indexOf("mierda"));

        //Verificacion
        System.out.println(reemplazo.contains("mierda"));

        //Para modificar un bucle sin crear muchos objetos
        StringBuilder creador = new StringBuilder();
        creador.append("Saludos").append("Terricola");
        String resultado = creador.toString();
        System.out.println(resultado);

        //Interpolar
        String interpolar = "Somos personas";
        System.out.println(interpolar.substring(0, 4) + 8 + interpolar.substring(6,12));
    }
}