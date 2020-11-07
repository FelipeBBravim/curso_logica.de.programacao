import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int gremio, inter;
		gremio = 0;
		inter = 0;

		int greGol, intGol, empate;
		greGol = 0;
		intGol = 0;
		empate = 0;

		int X = 1;

		while (X == 1) {

			inter = sc.nextInt();
			gremio = sc.nextInt();

			if (inter > gremio) {
				intGol += 1;
			} else if (inter < gremio) {
				greGol += 1;
			} else {
				empate += 1;
			}

			System.out.println("Novo grenal (1-sim 2-nao)");
			X = sc.nextInt();
		}

		int total = intGol + greGol + empate;

		String vence;
		if (intGol > greGol) {
			vence = "Inter venceu mais";
		} else if (intGol < greGol) {
			vence = "Gremio venceu mais";
		} else {
			vence = "Nao houve vencedor";
		}

		System.out.printf("%d grenais%nInter: %d%nGremio: %d%nEmpates: %d%n%s%n", total, intGol, greGol, empate, vence);

		sc.close();
	}

}
