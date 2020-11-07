import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A;
		
		A = sc.nextInt();
		
		if (A%2 == 0) {
			System.out.println(A + 1);
			System.out.println(A + 3);
			System.out.println(A + 5);
			System.out.println(A + 7);
			System.out.println(A + 9);
			System.out.println(A + 11);
		}
		else {
			System.out.println(A);
			System.out.println(A + 2);
			System.out.println(A + 4);
			System.out.println(A + 6);
			System.out.println(A + 8);
			System.out.println(A + 10);
		}
		
		sc.close();
	}

}
