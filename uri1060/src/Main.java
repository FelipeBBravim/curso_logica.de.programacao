import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4, n5, n6;
		
		n1 = sc.nextDouble();
		sc.nextLine();
		n2 = sc.nextDouble();
		sc.nextLine();
		n3 = sc.nextDouble();
		sc.nextLine();
		n4 = sc.nextDouble();
		sc.nextLine();
		n5 = sc.nextDouble();
		sc.nextLine();
		n6 = sc.nextDouble();
		sc.nextLine();
		
		if (n1 > 0) {
			n1 = 1;
		}
		else {
			n1 = 0;
		}
		if (n2 > 0) {
			n2 = 1;
		}
		else {
			n2 = 0;
		}
		if (n3 > 0) {
			n3 = 1;
		}
		else {
			n3 = 0;
		}
		if (n4 > 0) {
			n4 = 1;
		}
		else {
			n4 = 0;
		}
		if (n5 > 0) {
			n5 = 1;
		}
		else {
			n5 = 0;
		}
		if (n6 > 0) {
			n6 = 1;
		}
		else {
			n6 = 0;
		}
		
		int pos;
		
		pos = (int) (n1 + n2 + n3 + n4 + n5 + n6);
		
		System.out.println(pos + " valores positivos");
		
		sc.close();
	}

}
