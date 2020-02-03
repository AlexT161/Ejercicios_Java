import java.util.Scanner;

public class Logica{
    public static void main(String args[]){
    
    Scanner entrada = new Scanner(System.in);

    String nombre = "";
    int clave = 0;
    int antiguedad = 0;
    
    System.out.println("Bienvenido al sistema vacacional de SPM...");

    System.out.println("Name des Miterbeiter:");
    nombre = entrada.nextLine();

    System.out.println("Dienstzeit:");
    antiguedad = entrada.nextInt(); 

    System.out.println("Was ist der Schlüssel zu Ihrer Abteilung?");
    clave = entrada.nextInt(); 

    if (clave == 1){
        if(antiguedad == 1){
          System.out.println("El trabajador " + nombre + ", de Atención al cliente tiene derecho a 6 días de vacaciones.");  
        }
        else if(antiguedad >= 2 && antiguedad <= 6 ){
         System.out.println("El trabajador " + nombre + ", de Atención al cliente tiene derecho a 14 días de vacaciones.");   
        }
        else if(antiguedad >= 7 ){
         System.out.println("El trabajador " + nombre + ", de Atención al cliente tiene derecho a 22 días de vacaciones.");   
        }
        else {
         System.out.println("El trabajador " + nombre + ", de Atención al cliente aún no tiene derecho a vacaciones.");   
        }
    }
    else if (clave == 2){
        if(antiguedad == 1){
          System.out.println("El trabajador " + nombre + ", de Logística tiene derecho a 7 días de vacaciones.");  
        }
        else if(antiguedad >= 2 && antiguedad <= 6 ){
         System.out.println("El trabajador " + nombre + ", de Logística tiene derecho a 15 días de vacaciones.");   
        }
        else if(antiguedad >= 7 ){
         System.out.println("El trabajador " + nombre + ", de Logística tiene derecho a 22 días de vacaciones.");   
        }
        else {
         System.out.println("El trabajador " + nombre + ", de Logística aún no tiene derecho a vacaciones.");   
        }
    }
    else if (clave == 3){
        if(antiguedad == 1){
          System.out.println("El trabajador " + nombre + ", de Gerencia tiene derecho a 10 días de vacaciones.");  
        }
        else if(antiguedad >= 2 && antiguedad <= 6 ){
         System.out.println("El trabajador " + nombre + ", de Gerencia tiene derecho a 20 días de vacaciones.");   
        }
        else if(antiguedad >= 7 ){
         System.out.println("El trabajador " + nombre + ", de Gerencia tiene derecho a 30 días de vacaciones.");   
        }
        else {
         System.out.println("El trabajador " + nombre + ", de Gerencia aún no tiene derecho a vacaciones.");   
        }
    }
    else{
        System.out.println("La clave " + clave + " no está asignada a ningún departamento, ¡gilipollas!");
    }
}
}