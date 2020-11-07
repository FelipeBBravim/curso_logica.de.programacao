import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double q, w, e, r, t, y;
		
		q = sc.nextDouble();
		sc.nextLine();
		w = sc.nextDouble();
		sc.nextLine();
		e = sc.nextDouble();
		sc.nextLine();
		r = sc.nextDouble();
		sc.nextLine();
		t = sc.nextDouble();
		sc.nextLine();
		y = sc.nextDouble();
		sc.nextLine();
		
			
		double soma = (q + w + e + r + t + y);
		double somaABS = (Math.abs(q) + Math.abs(w) + Math.abs(e) + Math.abs(r) + Math.abs(t) + Math.abs(y));
		double somaNeg = (somaABS - soma) / 2;
		double somaPos = somaABS - somaNeg;
		
		double media;
		
		if (q > 0) {
			q = 1;
		}
		else {
			q = 0;
		}
		if (w > 0) {
			w = 1;
		}
		else {
			w = 0;
		}
		if (e > 0) {
			e = 1;
		}
		else {
			e = 0;
		}
		if (r > 0) {
			r = 1;
		}
		else {
			r = 0;
		}
		if (t > 0) {
			t = 1;
		}
		else {
			t = 0;
		}
		if (y > 0) {
			y = 1;
		}
		else {
			y = 0;
		}
		
		int pos = (int) (q + w + e + r + t + y);
		
		if (somaNeg == 0) {
			media = soma / 6;
		}
		else {
			media = somaPos / pos;
		}
		
		System.out.println(pos + " valores positivos");
		System.out.printf("%.1f", media);
		
		sc.close();
	}

}
