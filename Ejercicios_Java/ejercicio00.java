/*
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.------------------------------OK
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).-----------------------------------OK
 * - Crea una variable (y una constante si el lenguaje lo soporta).-------------OK
 * - Crea variables representando todos los tipos de datos primitivos----------OK
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"------OK
 */

public class ejercicio00 {

    private static final int MI_CONSTANTE_GLOBAL = 1;   //Constante privada, pertenece a la clase y es inmutable
    public static final int MI_CONSTANTE_GLOBAL_2 = 2;  //Constante publica, pertenece a la clase y es inmutable
    public final int MI_CONSTANTE_GLOBAL_3 = 3; //Constante publica (accesible desde cualquier clase), inmutable, y como no tiene static cada objeto tendra una copia de esta constante.

    public static void main(String[] args) {
        /**
         * Java official website: https://www.java.com/es/
         * Comentario Javadoc
         */

        /* Comentario
        en
        bloque */

        //Comentario unico

        final int miConstanteLocal = 4; //Constante local, solo dentro del metodo main.
        int miVariable = 1; //Variable

        byte numeritoChiquitito = 127;  //Tipo bye, precision baja
        short numerito = 32767;         //Tipo short, precision baja
        int numero = 2147483647;        //Tipo int, de uso estandar
        long numeroGrande = 9223372036854775807l;   //Tipo long, mayor precision. Requiere especificar con L o l

        float decimalPeque = 3.40000000000000000f;                              //Tipo float, decimales de menor precision que double. Requiere especificar con F o f
        double decimalGrandote = 1.800000000000000000000000000000000000000;     //Tipo double, de uso estandar

        char c = 'c';                       //Tipo char, un caracter
        String miString = "Cadena literal"; //Tipo String = Clase String

        boolean siono = true;   //Tipo boolean, tipo logico. true or false

        //Impresion en pantalla de Hola, java
        System.out.println("Hola, java");

        //Impresion en pantalla de constantes declaradas
        System.out.println("Constante global 1 = " + MI_CONSTANTE_GLOBAL);          //Constante global static privada  
        System.out.println("Constante global 2 = " + MI_CONSTANTE_GLOBAL_2);        //Constante global static publica
        ejercicio00 obj = new ejercicio00();                                        //Instanciacion de un nuevo objeto ejercicio00 para usar...
        System.out.println("Constante global 3 = " + obj.MI_CONSTANTE_GLOBAL_3);    //Constante global NO STATIC (fuera de clase) publica. Necesario instanciar un nuevo objeto para usarla dentro del metodo principal public static void main
        System.out.println("Constante local = " + miConstanteLocal);                //Constante local. Solo dentro del metodo main

        //Impresion en pantalla de variable
        System.out.println("Mi variable = " + miVariable);

        //Impresion en pantalla de tipos primitivos.
        System.out.println("Byte 8 bits, rango de -128 a " + numeritoChiquitito);                               //byte
        System.out.println("Short 16 bits, rango de -32.768 a " + numerito);                                    //short
        System.out.println("Int 32 bits, rango de -2147483648 a " + numero);                                    //int
        System.out.println("LONG 64 bits, rango de -9223372036854775808 a " + numeroGrande);                    //long
        System.out.println("Float 32 bits, rango de 1.00000000000000... a " + decimalPeque);                    //float
        System.out.println("Double 64 bits, rango de 4.9000000000000000000000000000000 a " + decimalGrandote);  //double
        System.out.println("Char, 16 bits, almacena un solo caracter Unicode, en este caso = " + c);            //char
        System.out.println("String, clase String = " + miString);                                               //String
        System.out.println("Boolean, true o false, en este caso = " + siono);                                   //boolean

        System.out.print(" FINALIZADO!");
    }
}