import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vet = new double[N];
		
		for (int i = 0; i<N; i++) {
			vet[i] = sc.nextDouble();
		}
		
		for (int u=0; u<N; u++) {
			System.out.printf("%.2f%n", vet[u]);
		}
		
		sc.close();
	}

}
