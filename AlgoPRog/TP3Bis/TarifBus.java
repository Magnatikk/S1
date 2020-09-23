import java.util.*;

class TarifBus {
	
	final static 
	
		long enfant = 25,
	 	lambda = 120,
		 reduction = 80;


	public static void main(String[] args) {

		int age;
		int location;
		double prix;
		int ct;
		int eu;

		java.util.Scanner sc = new java.util.Scanner(System.in);

			System.out.println("Rentrez votre age");		

				age = Integer.parseInt(sc.nextLine());
			
			System.out.println("Habitez vous à Montreuil ? Tapez 1 pour Oui et 0 pour Non");
		
				location = Integer.parseInt(sc.nextLine());

		sc.close();

		if (age < 3)
			prix = enfant;

		else if ( 20 >= age || age > 65)
			prix = reduction;
			
		else
			prix = lambda;

	
	prix = (prix/100);
	eu = (int)prix;
	ct = (int)((prix*100 - eu*100 ));

		if (location == 1) {

			prix = (prix*0.7);
			eu = (int)prix;
			ct = (int)((prix*100 - eu*100 ));
				System.out.println("Votre prix de ticket est de " + eu + "euros et " + ct + "centimes");
		}		
	
		else if (location == 0) {
			System.out.println("Votre prix de ticket est de " + eu + "euros et " + ct + "centimes");
		}
		else 
			System.out.println("Selectionnez le bon chiffre merde");	
	}	
}