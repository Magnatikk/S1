import java.util.Scanner;
public class Intpair {

	public static void main(String[] args) {

		int a;

		System.out.println("Rentrez un chiffre compris entre 1 et 100 inclus");
		Scanner sc = new Scanner(System.in);
		a = Integer.parseInt(sc.nextLine());

			while (a > 100 || a < 0 ) {
	 			System.out.println("Rentrez un chiffre compris entre 1 et 100 inclus");
				 a = Integer.parseInt(sc.nextLine());
			}
	}
}