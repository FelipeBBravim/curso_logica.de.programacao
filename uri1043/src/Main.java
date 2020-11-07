import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, area, per;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		if (A >= B + C || B >= C + A || C >= B + A) {
			area = ((A + B) * C) / 2;
			System.out.println("Area = " + area);
		}
		else {
			per = A + B + C;
			System.out.println("Perimetro = " + per);
		}
		
		sc.close();
	}

}
