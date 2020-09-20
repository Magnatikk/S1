import java.util.*;

	public class Grand {

		public static void main(String[] args) {

			int nb1;
			int nb2;
			int nb3;

			java.util.Scanner sc = new java.util.Scanner(System.in);

			System.out.println("Premier entier");
				nb1 = Integer.parseInt(sc.nextLine());

			System.out.println("Deuxieme entier");
				nb2 = Integer.parseInt(sc.nextLine());

			System.out.println("Troisieme entier");
				nb3 = Integer.parseInt(sc.nextLine());

			if (nb1 == nb2 && nb2 == nb3)
				System.out.println("Les nombres sont égaux");


			if (nb1 > nb2) {
				
				if (nb3 > nb1 && nb3 > nb2)
					System.out.println(nb3);
				
				else
					System.out.println(nb1);
				
			}
			if (nb2 > nb1){
				
				if (nb3 > nb1 && nb3 > nb2)
					System.out.println(nb3);
				
				else
					System.out.println(nb2);
				
			}

		}
	}



	