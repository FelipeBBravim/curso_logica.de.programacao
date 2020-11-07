import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		int [] A = new int[N];
		
		for(int i=0;i<N;i++) {
			A [i] = sc.nextInt();
		}
		
		for(int u=0;u<N;u++) {
			if(A[u]<0) {
				System.out.println(A[u]);
			}
		}
		
		sc.close();
	}

}
