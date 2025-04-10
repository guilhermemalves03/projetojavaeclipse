package projetoinem;
import java.util.Scanner;


public class INEM {
	
	public void adicionar_ocorrencia(String[] args) {
		System.out.println("Descricao da Ocorrencia");
		
		System.out.println("Localizacao (lon, lat)");
		
		System.out.println("Nome do doente");
		
		System.out.println("Numero de utente do doente");
	}
	
	public void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==============INEM==============");
		System.out.println("=      1-Operador              =");
		System.out.println("=      2-Administrador         =");
		System.out.println("=      X-Sair                  =");
		System.out.println("================================");
		System.out.println("Opcao:");
		scan.close();
	}

}

