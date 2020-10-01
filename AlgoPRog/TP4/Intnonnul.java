import java.util.Scanner;
public class Intnonnul {

	public static void main(String[] args) {

		int a;

		System.out.println("Rentrez un chiffre");
		Scanner sc = new Scanner(System.in);
		a = Integer.parseInt(sc.nextLine());

			while (a==0) {
	 			System.out.println("Rentrez un chiffre");
				 a = Integer.parseInt(sc.nextLine());
			}
			if (a<0){
				while (a%2==0){
					System.out.println("Rentrez un chiffre");
				 	a = Integer.parseInt(sc.nextLine());
				}
			}
			else {
				while (a%2!=0){
					System.out.println("Rentrez un chiffre");
					a = Integer.parseInt(sc.nextLine());
				}
			}		
	}
}	



