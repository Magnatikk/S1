import java.util.Scanner;

public class Clavier {
		
		public static void main (String[] args){	

//On demande à l'utilisateur de rentrer son nom avec un scanner

		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Votre nom : ");

//La saisie clavier est afffecté au String nomUtilisateur

			String nomUtilisateur = saisie.nextLine();

//Le programme renvoie le nom tapé précédé de Bonjour

		System.out.println("Bonjour " + nomUtilisateur);
		}
}
