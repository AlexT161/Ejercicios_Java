import java.util.Scanner;

public class OperacionesCase{
    public static void main(String args[]){

    int num_1 = 5, num_2 = 3, resultado = 0, parametro = 0;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingresa un entero:");
    num_1 = entrada.nextInt();
    System.out.println("Ingresa otro entero:");
    num_2 = entrada.nextInt();
    System.out.println("Escoge una operación del 1 al 4:");
    parametro = entrada.nextInt();

    switch(parametro){
        case 1:
            resultado = num_1 + num_2;
            System.out.println("El resultado de la suma es " + resultado);
            break;
        case 2:
            resultado = num_1 - num_2;
            System.out.println("El resultado de la resta es " + resultado);
            break;
        case 3:
            resultado = num_2 - num_1;
            System.out.println("El resultado de la resta es " + resultado);
            break;
        case 4:
            resultado = num_1 * num_2;
            System.out.println("El resultado de la multiplicación es " + resultado);
            break;
        default:
            System.out.println("Error, la opción no existe.");
            break;
    }
    }
}