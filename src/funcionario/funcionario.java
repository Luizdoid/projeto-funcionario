package funcionario;


import java.util.Locale;
import java.util.Scanner;
public class funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);


		// TRATATIVAS //
		while (opcao != 4) {
			if (opcao == 1) {
				System.out.println("");
				System.out.println("Total de horas = " + horatotal);
				System.out.println("");
			}
			else if (opcao == 2) {
				System.out.println("");
				System.out.printf("Custo total = R$ %.2f%n", custototal);
				System.out.println("");
			}

			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.println("Digite uma opção: ");
			opcao = sc.nextInt();

		}


		sc.close();
	}

		
		
		sc.close();
	}
}
	