import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int X = sc.nextInt();
		int soma;
		
		while (X != 0) {
			
					
			if(X % 2 == 0) {
				
				soma = 5 * (X + 4);
			}
			else {
				soma = 5 * (X + 5);
			}
			
			System.out.println(soma);
			X = sc.nextInt();
		}
		
		sc.close();
	}

}
