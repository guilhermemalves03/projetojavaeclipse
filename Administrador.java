package projetoinem;
import java.util.Scanner;

public class Administrador {
	public boolean administrador() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Email:");
		String email = scan.nextLine();
		System.out.println();
		System.out.print("Password:");
		String password = scan.nextLine();
		
		if (email == "admin@gov.pt" && password == "admin321" ) {
			
		}
		else {
			System.out.print("Administrador nao reconhecido.");
			
		}
		
	}

}
