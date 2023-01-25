import java.util.Scanner;

public class ejercicio_tema_4 {
    public static void main(String[] args) {
        // Usando un if, crear una condición que compare
        // si la variable numeroIf es positivo, negativo, o 0.

        // invoco al escaner y pido numero
        Scanner lectura = new Scanner (System.in);
        System.out.println("Introduzca un número entero:");
        int numerlof = lectura.nextInt();

        // comparacion con un if
        if (numerlof > 0) {
            System.out.println("El numero es positivo.");
        }
        else if (numerlof < 0) {
            System.out.println("El numero es negativo.");
        }
        else{
            System.out.println("El numero es cero.");
        }

        // Crea un bucle While, este bucle tendrá que tener
        // como condición que la variable numeroWhile sea inferior
        // a 3, el bloque de código que tendrá el bucle deberá:

        //      Incrementar el valor de la variable en
        //      uno cada vez que se ejecute.

        //      Mostrarlo por pantalla cada vez
        //      que se ejecute.

        // pido numero
        System.out.println("Introduzca un número entero:");
        int numeroWhile = -2;
        // bucle while
        while (numeroWhile < 3) {
            System.out.println("El valor de numeroWhile es:"+numeroWhile); // muestro valor
            numeroWhile++; // incremento en 1
        }

        // Para el bucle Do While, deberás crear la misma estructura que en el
        // While, pero solo se debe ejecutar una vez.

        // bucle doWhile
        do {
            System.out.println("El valor de numeroWhile es:"+numeroWhile); // muestro valor
            numeroWhile++;
        } while (false);

        // Para el bucle For, crea una variable numeroFor, esta variable tendrá
        // como valor 0 y su condición será que la variable sea igual o menor que
        // 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá
        // mostrarse por pantalla.

        int numeroFor = 0;
        // bucle for
        for (numeroFor; numeroFor <= 3; numeroFor++) {
            // valor por pantalla
            System.out.println("El valor de numeroFor es: "+ numeroFor);
        }

        // Por último, para el Switch, deberás crear la variable estacion, y
        // distintos case para las cuatro estaciones del año. Dependiendo del
        // valor de la variable estacion se deberá mandar un mensaje por
        // consola informando de la estación en la que está. También habrá que
        // poner un default para cuando el valor de la variable no sea una
        // estación.
        // invoco al escaner y pido numero

        System.out.println("Introduzca un número de estacion:");
        String estacion = lectura.nextLine();
        boolean control = true;
        while (control == true){
            // selector switch
            switch (estacion) {

                case "Invierno":
                    System.out.println("Se encuentra usted en INVIERNO.");
                    break;
                case "Primavera":
                    System.out.println("Se encuentra usted en PRIMAVERA.");
                    break;
                case "Verano":
                    System.out.println("Se encuentra usted en VERANO.");
                    break;
                case "Otoño":
                    System.out.println("Se encuentra usted en OTOÑO.");
                    break;
                default:
                    System.out.println("Escriba una estacion del año.");
                    control = false;
            }
        }

    }
}
