public class Ciclos{
 public static void main(String args[]){

 int i = 0;
 System.out.println("Serie For:");
 for(i=1; i <= 10; i++){
    if(i < 10){
        System.out.print(i + ",");
    }
    else{
        System.out.println(i);
    }
 }
 i = 1;
 System.out.println("Serie While:");
 while(i <= 10){
 if(i < 10){
        System.out.print(i + ",");
    }
    else{
        System.out.println(i);
    }
    i++;
 }

 i = 1;
 System.out.println("Serie Do-While:");
 do{
 if(i < 10){
        System.out.print(i + ",");
    }
    else{
        System.out.println(i);
    }
    i++;
 }while(i <= 10);
 }   
}