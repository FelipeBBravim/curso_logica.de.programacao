import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A;
		String B;
		
		A = sc.nextInt();
		
		switch(A) {
		case 61:
			B = "Brasilia";
			break;
		case 71:
			B = "Salvador";
			break;
		case 11:
			B = "Sao Paulo";
			break;
		case 21:
			B = "Rio de Janeiro";
			break;
		case 32:
			B = "Juiz de Fora";
			break;
		case 19:
			B = "Campinas";
			break;
		case 27:
			B = "Vitoria";
			break;
		case 31:
			B = "Belo Horizonte";
			break;
			
		default:
			B = "DDD nao cadastrado";			
		}
		
		System.out.println(B);
		
		
		sc.close();
	}

}
