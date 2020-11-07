import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		double nota = 0;
		double cont = 0;
		double soma = 0;
		
		while (cont <2) {
			
			nota = sc.nextDouble();
			
			if (nota >=0 && nota <= 10) {
				cont = cont + 1;
				soma = soma + nota;
			}
			else {
				System.out.println("nota invalida");
			}
			
		}
		
		double media = soma / cont;
		System.out.printf("media = %.2f%n", media);
		
		sc.close();
	}

}
