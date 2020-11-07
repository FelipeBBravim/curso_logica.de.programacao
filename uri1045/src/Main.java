import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		
		if (x > y && x > z) {
			A = x;
			B = y;
			C = z;
		}
		else if (y > z) {
			A = y;
			B = x;
			C = z;
		}
		else {
			A = z;
			B = x;
			C = y;
		}
		
		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else {
			if (A * A == B * B + C * C) {
				System.out.println("TRIANGULO RETANGULO");
			}
			else if (A * A > B * B + C * C) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			else if (A * A < B * B + C * C) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if ( A == B && A == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			else if (A == B || A == C || B == C) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
				
		sc.close();
	}

}
