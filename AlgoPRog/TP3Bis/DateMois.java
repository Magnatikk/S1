import java.util.Scanner;

class DateMois {
	
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int jour, mois, annee, bis;

			System.out.println("Rentrez le jour");
				jour = Integer.parseInt(sc.nextLine());

			System.out.println("Rentrez le mois");
				mois = Integer.parseInt(sc.nextLine());	

			System.out.println("Rentrez l'année");
				annee = Integer.parseInt(sc.nextLine());	

		if ( 0>jour || jour>31 || mois<0 || mois>12 || annee<1582)
			System.out.println("Rentrez une date correcte");

		else if (annee%4 != 0 && mois == 2 && jour == 29 )
			System.out.println("Date incorrecte");
		
		else if (annee%4 == 0 && mois == 2 && jour == 29 )
			System.out.println("Date Correcte");

		else {
			
			if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12)
				System.out.println("Date correcte");

			else {

				if (jour > 30)
					System.out.println("Rentrez le bon jour");

				else 
					System.out.println("Date correcte");	
			}
		}
	}
}
