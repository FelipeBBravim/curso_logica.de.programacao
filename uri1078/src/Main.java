import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int X;
		
		for (X = 1; X <= 10; X++) {
			int M = X * N;
			System.out.println(X + " x " + N + " = " + M);
		}
		
		sc.close();
	}

}
