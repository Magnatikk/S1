import java.util.*;

	public class Bac {

		public static void main(String[] args) {

		double moyenne;
		double moyenneR;

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Quelle est votre moyenne obtenue au Bac ?");
		moyenne = Double.parseDouble(sc.nextLine());


		if (moyenne < 0 || moyenne > 20)
			System.out.println("moyenne incorrecte");

		else if (moyenne >= 16)
			System.out.println("admis mention très bien");

		else if (moyenne >= 14)
			System.out.println("admis mention bien");

		else if (moyenne >= 12)
			System.out.println("admis mention assez bien");

		else if (moyenne >= 10)
			System.out.println("admis mention swag");

		else if (moyenne < 8)
			System.out.println("Refusé");

		else {
			System.out.println("Rattrapage");
			
			System.out.println("Moyenne après le rattrapage ?");
			 	
			 	moyenneR = Double.parseDouble(sc.nextLine());
					
					if (moyenneR > 10)
						System.out.println("T'as ton bac bg");
					
					else
						System.out.println("Refusé");

		}

		}

	}
