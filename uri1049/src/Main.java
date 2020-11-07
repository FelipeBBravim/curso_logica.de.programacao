import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n1, n2, n3, R;
				
		n1 = sc.nextLine();
		n2 = sc.nextLine();
		n3 = sc.nextLine();
		R = null;
		
		switch (n1) {
		case "vertebrado":
			switch (n2) {
			case "ave":
				switch (n3) {
				case "carnivoro":
					R = "aguia";
					break;
				case "onivoro":
					R = "pomba";
					break;
				}
				break;
			case "mamifero":
				switch (n3) {
				case "onivoro":
					R = "homem";
					break;
				case "herbivoro":
					R = "vaca";
					break;
				}
				break;
			}
			break;
		case "invertebrado":	
			switch (n2) {
			case "inseto":
				switch (n3) {
				case "hematofago":
					R = "pulga";
					break;
				case "herbivoro":
					R = "lagarta";
					break;
				}
				break;
			case "anelideo":
				switch (n3) {
				case "hematofago":
					R = "sanguessuga";
					break;
				case "onivoro":
					R = "minhoca";
					break;
				}
				break;
			}
			break;
		}
		
		System.out.println(R);
		
		sc.close();
	}

}
