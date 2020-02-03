public class CicloFibo{
    public static void main(String args[]){
    int a = 0, b = 1, c = 0 ,i = 0;
    System.out.println("Ciclo for:");
    for (i = 0; i < 10; i++) {
        if( i<9 ){
            System.out.print(a + ",");
            c = a + b;
            a = b;
            b = c;
        }
        else{
            System.out.println(a);
        }
    }

    a = 0;
    b = 1;
    c = 0;
    i = 0;
    System.out.println("Ciclo while:");
    while (i < 10) {
        if( i<9 ){
            System.out.print(a + ",");
            c = a + b;
            a = b;
            b = c;
        }
        else{
            System.out.println(a);
        }
        i++;
    }
    
    a = 0;
    b = 1;
    c = 0;
    i = 0;

    System.out.println("Ciclo do-while:");
    do {
        if( i<9 ){
            System.out.print(a + ",");
            c = a + b;
            a = b;
            b = c;
        }
        else{
            System.out.println(a);
        }
        i++;
    } while( i<10 );
    }
}