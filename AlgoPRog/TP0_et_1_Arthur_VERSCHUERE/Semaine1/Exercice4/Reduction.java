class Reduction {

//Déclaration d'une constante non modifiable (avec le final).

	public static final double R=0.95;

	public static void main (String args[]) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);

		double prix;

		System.out.print("Rentrer votre total :");
		prix = Double.parseDouble(sc.nextLine());

//Afin de ne pas pouvoir rentrer de valeur négative.
		
		if (prix<0) 
			System.out.println("Le montant rentré est incorrect");
		
		else {
			if(prix>=100)

//Afin de pouvoir calculer la réduction,on l'applique sur le montant supèrieur à 0, puis on remet les 100 après réduction.
				
				System.out.println("Votre total est de :" + (((prix-100)*R)+100));

			else
				System.out.println("Votre total est de :" + (prix));		
		}
	}
}