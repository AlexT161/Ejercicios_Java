public class CiclosDos{
 public static void main(String args[]){
    int i = 1;
    int j = 99;
    System.out.println("Serie For:");
    for (i = 1; i <=5 ; i++) {
      if(i < 5){
        System.out.print(i + "," + j + ",");
        }
      else{
        System.out.println(i + "," + j);
        }  
        j--;
    }

    i = 1;
    j = 99;
    System.out.println("Serie While:");
    while (i <=5) {
      if(i < 5){
        System.out.print(i + "," + j + ",");
        }
      else{
        System.out.println(i + "," + j);
        }  
        i++;
        j--;
    }

    i = 1;
    j = 99;
    System.out.println("Serie Do-While:");
    do {
      if(i < 5){
        System.out.print(i + "," + j + ",");
        }
      else{
        System.out.println(i + "," + j);
        }  
        i++;
        j--;
    }while(i <= 5);
 }
}