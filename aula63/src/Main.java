import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		String []nome = new String[N];
		int []idade = new int[N];
		double []altura = new double[N];
		
		for(int i=0;i<N;i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
			altura [i] = sc.nextDouble();
		}
		
		double altmed = 0;
		
		for(int i=0;i<N;i++) {
			altmed+=altura[i];
		}
		
		altmed = (double) altmed / N;
		System.out.printf("Altura média: %.2f%n", altmed);
		
		int menores = 0;
		
		for(int i=0;i<N;i++) {
			if(idade[i]<16) {
				menores++;
			}
		}
		
		double porcetagem = (double) menores / N * 100;
		System.out.printf("Pessoas com menos de 16 anos %.1f", porcetagem);
		
		sc.close();
	}

}
