import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double L, C, P, A, M;
		
		System.out.println("Largura: ");
		L = sc.nextDouble();
		
		System.out.println("Comprimento: ");
		C = sc.nextDouble();
		
		System.out.println("Preço: ");
		P = sc.nextDouble();
		
		A = L * C;
		M = P * A;
		
		System.out.printf("Área: %.2f%n"
				+ "Preço: %.2f%n", A, M);
		
		sc.close();
	}

}
