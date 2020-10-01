import java.util.Scanner;
public class Intdecroissantoucroissant {

	public static void main(String[] args) {

		int a,b,c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Rentrez un chiffre");
		a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Rentrez un 2eme chiffre strictement inférieur ou strictement supérieur au premier");
		b = Integer.parseInt(sc.nextLine());

		while(a==b) {
			System.out.println("Rentrez un 2eme chiffre strictement inférieur ou strictement supérieur au premier");
			b = Integer.parseInt(sc.nextLine());
		}

		System.out.println("Rentrez un 3eme chiffre");
		c = Integer.parseInt(sc.nextLine());

		if (a>=b){
			while (b<=c){
				System.out.println("Rentrez un 3eme chiffre inférieur au deuxieme");
				c = Integer.parseInt(sc.nextLine());
			}
		}
		else {
			while (b>=c){
				System.out.println("Rentrez un 3eme chiffre supérieur au deuxieme");
				c = Integer.parseInt(sc.nextLine());
			}
		}
	}
}