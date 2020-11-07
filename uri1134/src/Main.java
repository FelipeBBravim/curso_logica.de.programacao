import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int alcool, gasolina, diesel, cliente;
		
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		cliente = 0;
		
		while (cliente != 4) {
			cliente = sc.nextInt();
			
			switch (cliente) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			}
		}
		
		System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);
		
		sc.close();
	}

}
