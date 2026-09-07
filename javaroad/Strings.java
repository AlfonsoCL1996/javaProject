public class Strings {
    public static void main(String[] args) {
        //Constructor de objetos = new
        //Los objetos se pueden instanciar asi
        System.out.println(new String("Hola"));

        //String se puede declarar como un tipo primitivo, aunque ojo que no lo es!
        String greet = "A TODOS!";
        System.out.println(greet);

        //Longitud, muy importante
        System.out.println(greet.length());

        //charAt, obtener caracter, posicion 1. Siempre parte de 0, ojo!
        System.out.println(greet.charAt(0));
        //Buscamos el ultimo caracter
        System.out.println(greet.charAt(greet.length()-1));

        //Subcadena
        System.out.println(greet.substring(0,5));
    }    
}
