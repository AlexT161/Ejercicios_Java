import java.util.Scanner;

public class Login{
    public static void main(String args[]){
        String usuario = "", password = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Benutzername:");
        usuario = entrada.nextLine();

        System.out.print("Passwort:");
        password = entrada.nextLine();

        if(usuario.equals("ernesto") && password.equals("1234")){
            System.out.println("Willkomen ernesto");
        }
        else{
            System.out.println("Der Benutzername und das Kennwort werden von der Anmeldung wiederholt abgelehnt.");   
        }

    }
}