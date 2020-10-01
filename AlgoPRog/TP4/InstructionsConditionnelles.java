/*
 *  Diverses intructions conditionnelles pour lesquelles il faut deviner ce qu'elles affichent.
 */
public class InstructionsConditionnelles {

	public static void main(String[] args) {

		int a,b;
		boolean valide;
		char c;
		String nom;


		// question a.
		System.out.println("Question a :");
		a = 0; b = 4;
		if (a < 10 && b > 10)
			System.out.println("cas 1");
		else 
			System.out.println("cas 2");
		// Ecrivez ici ce qui, selon vous, va s'afficher à l'exécution : 		cas 2

		System.out.println();

		// question b.
		System.out.println("Question b :");
		a = 0; b = 4;
		if (a < 10 || b > 10)
			System.out.println("cas 1");
		else 
			System.out.println("cas 2");
		// Ecrivez ici ce qui, selon vous, va s'afficher à l'exécution : 		cas 1

		System.out.println();

		// question c.
		System.out.println("Question c :");
		a = 0; b = 4;
		if (a%2==0 && b%3==2)
			System.out.println("cas 1");
		else if (b%4==0)
			System.out.println("cas 2");
		else 
			System.out.println("cas 3");
		// Ecrivez ici ce qui, selon vous, va s'afficher à l'exécution : 		cas 2

		System.out.println();

		// question d.
		System.out.println("Question d :");
		a = 0; b = 4;
		if (a%2==0 && b%3==2)
			System.out.println("cas 1");
		else {
			b++;
			if (b%4==0)
				System.out.println("cas 2");
			else 
				System.out.println("cas 3");
		}
		// Ecrivez ici ce qui, selon vous, va s'afficher à l'exécution : 		cas 3

		System.out.println();

		// question e.
		System.out.println("Question e :");
		a = 0; b = 4;
		if (a%2==0 || (a%2!=0 && b%2 !=0) || !(b%3==0))
			System.out.println("cas 1");
		else if (a==0 && b==0)
			System.out.println("cas 2");
		else 
			System.out.println("cas 3");
		// Ecrivez ici ce qui, selon vous, va s'afficher à l'exécution : 		cas 1

		System.out.println();

		// question f.
		System.out.println("Question f :");
		a = 1; b = 6;
		if (a%2==0 || (a%2!=0 && b%2 !=0) || !(b%3==0))
			System.out.println("cas 1");
		else if (a==0 && b==0)
			System.out.println("cas 2");
		else 
			System.out.println("cas 3");
		// Ecrivez ici ce qui, selon vous, va s'afficher à l'exécution : 		cas 3

		System.out.println();

		// question g.
		System.out.println("Question g :");
		a = -2; b = -6; nom="Hedwige" ; valide = true;
		if (a<b)
			System.out.println("cas 1");
		if (!nom.equals("Edvige"))
			System.out.println("cas 2");
		if (valide)
			System.out.println("cas 3");
		// Ecrivez ici ce qui, selon vous, va s'afficher à l'exécution : 		cas 2 cas 3			

		System.out.println();

		// question h.
		System.out.println("Question h :");
		a = -2; nom="Hedwige" ; valide = false;
		if (!valide) {
			if (nom.equalsIgnoreCase("hedwige") && a%2==0)
				System.out.println("cas 1");
			else 
				System.out.println("cas 2");
		}
		else 
			System.out.println("cas 3");
		// Ecrivez ici ce qui, selon vous, va s'afficher à l'exécution : 		cas 1				

		System.out.println();

		// question i.
		System.out.println("Question i :");
		c = 'r'; valide = false;
		if (valide) {
			if (c=='R')
				System.out.println("cas 1");
			if (c=='r')
				System.out.println("cas 2");
			c++;
			if (c=='s')
				System.out.println("cas 3");
		}
		else 
			System.out.println("cas 4");
		// Ecrivez ici ce qui, selon vous, va s'afficher à l'exécution : 		cas 4		

		System.out.println();
		
		// question j.
		System.out.println("Question j :");
		c = 'r'; valide = true;
		if (valide) {
			if (c=='R')
				System.out.println("cas 1");
			if (c=='r')
				System.out.println("cas 2");
			c++;
			if (c=='s')
				System.out.println("cas 3");
		}
		else 
			System.out.println("cas 4");
		// Ecrivez ici ce qui, selon vous, va s'afficher à l'exécution : 		cas 2 cas 3		

		
	}

}
