public class primerosPasos {
    public static void main(String[] args) {
        //Variable tipo String con tu nombre
        String myName = "Aloiso";
        System.out.println(myName);
        //Variable tipo entero con tu edad
        int myAge = 30;
        System.out.println(myAge);
        //Variable tipo decimal con tu altura
        double myHeight = 1.75;
        System.out.println(myHeight);
        //Variable tipo booleano sobre si te gusta programar
        boolean programming = true;
        System.out.println(programming);
        //Constante con tu email
        final String myEmail = "nalgablanca59@gmail.com";
        System.out.println(myEmail);
        //Variable tipo caracter con tu inicial
        char myCapital = 'a';
        System.out.println(myCapital);
        //Variable tipo String con tu localidad e imprime, a coninuacion cambia su valor y vuelve a imprimir
        String myVillage = "Luceni";
        System.out.println(myVillage);
        myVillage = "Zaragoza";
        System.out.println(myVillage);
        //Variable int llamada a, y variable int llamada b. Imprime la suma de ambas
        int a = 1;
        int b = 4;
        int suma = a+b;
        System.out.println("El valor de a = " + a);
        System.out.println("El valor de b = " + b);
        System.out.println("La suma de a + b = " + suma);
        //Intenta declarar una variable sin inicializarla, luego asignale un valor e imprimir
        int c;
        c = 10;
        System.out.println(c);
    }
}