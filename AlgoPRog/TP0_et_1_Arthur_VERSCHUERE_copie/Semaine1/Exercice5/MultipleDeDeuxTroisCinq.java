import javax.swing.JOptionPane;
import java.util.*;
class MultipleDeDeuxTroisCinq {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		/*int chiffre;

		System.out.println("Rentrez votre nombre entier :");
		chiffre = Integer.parseInt(sc.nextLine()); */


//______________________________Je n'arrive pas à trouver ce qui est faux dans ce bloc_________________
//																								  	
//On décalare un int ainsi qu'un booléen rajoutant une condition d'erreur

	int chiffre;																			  
		boolean failed = false;																	  
																								  
			System.out.println("Rentrez votre nombre entier :");								  
			
//On crée un bloc try catch afin de voir si le nombre est un entier ou pas

			try {																				  
			chiffre = Integer.parseInt(sc.nextLine());											  
			 																					  																
 			}
 			 catch(Exception e)
  {
     failed = true;
     chiffre = 0;
      System.out.println(e.getMessage());
  }
  if (failed)
  {
     System.out.println("Le nombre n'est pas un nombre entier, veuillez en rentrer un nouveau");   

 }
  else {



//Je n'arrive pas à faire continuer le programme si il ne trouve pas d'exception		
//____________________________________________________________________________________________________
 

//Pour vérifier si le chiffre est un multiple de 2 (pair ou impair)

		if (chiffre%2==0)
			System.out.println("Le nombre est pair");

		else
			System.out.println("Le nombre est impair");

//Pour vérifier si le chiffre est un multiple de 3

		if (chiffre%3==0)		
			System.out.println("Le nombre est multiple de 3");
		
		else
			System.out.println("Le nombre est non multiple de 3");

//Pour vérifier si le chiffre est un multiple de 5		

		if (chiffre%5==0)
			System.out.println("Le nombre est multiple de 5");
		
		else
			System.out.println("Le nombre est non multiple de 5");
	
		}
	}
}