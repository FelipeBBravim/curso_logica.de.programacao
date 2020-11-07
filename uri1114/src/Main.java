import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int certo = 2002;
		int senha = 0;
		
		senha = sc.nextInt();
		
		while (senha != certo) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();			
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
