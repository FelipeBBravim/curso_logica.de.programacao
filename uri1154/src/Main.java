import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int conta = 0;
		
		while (idade > 0) {
			conta += 1;
			soma += idade;
			idade = sc.nextInt();
		}
		
		double media = (double) soma / conta;
		System.out.printf("%.2f", media);
		
		sc.close();
	}

}
