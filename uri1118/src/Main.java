import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double nota = 0;
		double soma = 0;
		double cont = 0;
		int X = 1;

		while (X != 2) {

			if (X == 1) {
				if (cont < 2) {
					nota = sc.nextDouble();
					if (nota >= 0 && nota <= 10) {
						soma += nota;
						cont += 1;
					} else {
						System.out.println("nota invalida");
					}
				} else {
					double media = soma / cont;
					System.out.printf("media = %.2f%n", media);
					System.out.println("novo calculo (1-sim 2-nao)");
					cont = 0;
					soma = 0;
					X = sc.nextInt();
				}
			}
			else {
				System.out.println("novo calculo (1-sim 2-nao)");
				X = sc.nextInt();
			}
		}

		sc.close();
	}

}