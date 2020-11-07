import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double renda, imposto;
		
		renda = sc.nextDouble();
		
		if (renda < 2000.0) {
			System.out.println("Isento");
		}
		else if (renda < 3000.00) {
			imposto = (renda - 2000.00) * 8 / 100;
			System.out.printf("R$ %.2f%n", imposto);
		}
		else if (renda < 4500.00) {
			imposto = 1000.00 * 8 / 100 + ((renda - 3000.00) * 18 / 100);
			System.out.printf("R$ %.2f%n", imposto);
		}
		else {
			imposto = 1000.00 * 8 / 100 + 1500.00 * 18 / 100 + ((renda - 4500.00) * 28 / 100);
			System.out.printf("R$ %.2f%n", imposto);
		}
						
		sc.close();
	}

}
