
/*
 * DeuxBonjours.java
 * Ce programme écrit :
 *    "Bonjour Fifi !"
 * puis à la ligne :
 *    "Bonjour Riri !"
 */

public class DeuxBonjours {

	public static void main (String[] args){		

//On déclare deux strings afin de pouvoir les remplacer par des noms

		String nomUtilisateur1, nomUtilisateur2;
		
		nomUtilisateur1 = "Fifi";
		nomUtilisateur2 = "Riri";
		
		System.out.println("Bonjour " + nomUtilisateur1 + " !");
		System.out.println("Bonjour " + nomUtilisateur2 + " !");
	}	
	
}