import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		double []vet = new double[N];
		double soma = 0;
		double media = 0;
		
		for(int i=0;i<N;i++) {
			vet[i]=sc.nextDouble();
		}

		for(int i=0;i<N;i++) {
			soma+=vet[i];
		}
		
		media = soma / N;
		
		for(int i=0;i<N;i++) {
			System.out.printf("%.2f ", vet[i]);

		}
		System.out.println("");
		System.out.println(soma);
		System.out.println(media);
		
		sc.close();
	}

}
