import java.util.Locale;
import java.util.Scanner;

public class funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		System.out.printf("Digitar outro (S/N)? ");
		digitar = sc.next().charAt(0);

		while (digitar == 's' || digitar == 'S') {
			System.out.printf("Nome: ");
			nome = sc.next();

			System.out.printf("Horas trabalhadas: ");
			horastrabalhadas = sc.nextDouble();

			while (horastrabalhadas < 0) {
				System.out.printf("Horas trabalhadas: ");
				horastrabalhadas = sc.nextDouble();
			}

			System.out.printf("Valor por hora: ");
			valorporhora = sc.nextDouble();

			while (valorporhora < 0) {
				System.out.printf("Valor por hora: ");
				valorporhora = sc.nextDouble();
			}
			System.out.printf("Digitar outro (S/N)? ");
			digitar = sc.next().charAt(0);

		}
	
		
		
		
		sc.close();
	}

	}