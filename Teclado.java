import java.util.Scanner;

public class Teclado{
    public static void main(String args[]){

    Scanner entrada = new Scanner(System.in);
    String name = "";
    int num_1 = 0, num_2 = 0, result = 0;

    System.out.println("Wie heisst du?");
    name = entrada.nextLine();

    System.out.println("Was ist die erste nummer?");
    num_1 = entrada.nextInt();
    
    System.out.println("Was ist die zweite nummer?");
    num_2 = entrada.nextInt();
    
    result = num_1 + num_2;

    System.out.println("Hola " + name + ",el resultado de la suma es: " + result);
    }
}