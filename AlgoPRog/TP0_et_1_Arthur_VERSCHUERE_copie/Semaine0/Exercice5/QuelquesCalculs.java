/* 
 * QuelquesCalculs.java
 */
import java.util.Scanner;

class QuelquesCalculs {
	

	public static void main (String args[]) {
		
		Scanner saisie = new Scanner(System.in);

		int a;
		System.out.print("Rentrez la valeur de a (12 dans le cas de cet exercice) :");
 		a = Integer.parseInt(saisie.nextLine());
 		
 		int b;
 		System.out.print("Rentrez la valeur de b (5 dans le cas de cet exercice) :");
 		b = Integer.parseInt(saisie.nextLine());
 		 
 		double x;
 		System.out.print("Rentrez la valeur de x :");
 		x = Double.parseDouble(saisie.nextLine());
  
  		double y;
  		System.out.print("Rentrez la valeur de y :");
		y = Double.parseDouble(saisie.nextLine());
		
		
		// affichage des deux entiers et de tout les calculs possibles
		System.out.println("a vaut " + a + ", b vaut " + b);
		System.out.println(("a + b = ") + (a+b) );
		System.out.println(("a - b = ") + (a-b) );
		System.out.println(("a * b = ") + (a*b) );
		System.out.println(("a / b = ") + (a/b) );
		System.out.println(("a % b = ") + (a%b) );

		System.out.println(("b / a = ") + (b/a) );
		System.out.println(("b % a = ") + (b%a) );


		
		// affichage des deux réels et du résultat de leur division
		System.out.println("x vaut " + x + ", y vaut " + y);
		System.out.println(("x / y = ") + (x / y) );
		
		System.out.println();  // Saut de ligne
		
		if (x>0) {
			System.out.println("x est positif");
		}

		System.out.println();
		
		if (x*y<0)
			System.out.print("Le produit de x par y est négatif ");
			System.out.println("donc soit x est négatif soit y est négatif.");

		System.out.println();

		if (a%2 == 0)
			System.out.println("a est un nombre pair");
					
		else 
			System.out.println("a est un nombre impair");	

		saisie.close();

	}
}


