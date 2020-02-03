public class Anidado{
    public static void main(String args[]){

    int operacion = 1;
    int num_1 = 8;
    int num_2 = 4;
    int result = 0;

    if (operacion == 1){
    result = num_1 + num_2;
    System.out.println("El resultado de la operación es :" + result);
    } else if(operacion == 2){
    result = num_1 - num_2;
    System.out.println("El resultado de la operación es :" + result);
    } else if(operacion == 3){
    result = num_1 * num_2;
    System.out.println("El resultado de la operación es :" + result);
    } else if(operacion == 4){
    result = num_1 / num_2;
    System.out.println("El resultado de la operación es :" + result);
    } else {
    System.out.println("La opción no existe");
    }
    }
}