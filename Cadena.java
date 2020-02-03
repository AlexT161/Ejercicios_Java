import java.util.Scanner;

public class Cadena{
    public static void main(String[] args) {
        String cadena_uno = "";
        String cadena_dos = "";
        int num_car = 0, desde = 0 , hasta = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cadena de carateres: ");
        cadena_uno = teclado.nextLine();
        num_car = cadena_uno.length();
        System.out.println("La cadena " + cadena_uno + " tiene " + num_car + " caracteres.");
        System.out.println("¿Que parte de la cadena deseas extraer?");
        System.out.print("Desde:");
        desde = teclado.nextInt();
        System.out.print("Hasta:");
        hasta = teclado.nextInt();

        cadena_dos = cadena_uno.substring(desde, hasta);
        System.out.println("La nueva cadena es " + cadena_dos);

    }
}