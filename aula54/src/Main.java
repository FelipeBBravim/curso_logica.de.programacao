import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		double C;
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			C = sc.nextDouble();
			sc.hasNextLine();
			double F = (9 * C / 5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while(resp != 'n');
		
		sc.close();
	}

}
