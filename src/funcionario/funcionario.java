import java.util.Locale;
import java.util.Scanner;

public class funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);


		//MENU//
		
		System.out.println("");
		System.out.println("MENU");
		System.out.println("1 - Total de horas trabalhadas");
		System.out.println("2 - Custo total");
		System.out.println("3 - Nome da pessoa que ganhou mais");
		System.out.println("4 - Sair");
		System.out.println("Digite uma op��o: ");

		int opcao;
		opcao = sc.nextInt();

		while (opcao != 4) {
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.println("Digite uma op��o: ");
			opcao = sc.nextInt();
		}
		
		
		sc.close();
	}

	}