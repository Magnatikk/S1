import java.util.Scanner;

class Signe {
	
	public static void main (String args[]) {
		
		Scanner saisie = new Scanner(System.in);

//On rentre notre premier entier

		int a;
		System.out.print("Rentrer votre premier nombre entier :");
 		a = Integer.parseInt(saisie.nextLine());

//On rentre le deuxième entier

 		int b;
		System.out.print("Rentrer votre deuxième nombre entier :");
 		b = Integer.parseInt(saisie.nextLine());

//Si l'un des deux entiers est nul, alors le produit est forcément nul (OU logique)

 		if (a==0 || b==0) 
 			System.out.println("Le produit est nul");
 	
//Sinon, si les deux entiers sont positifs OU les deux entiers sont négatifs, le produit est positif

 		else if (a>0 && b>0 || a<0 && b<0)
			System.out.println("Le produit est positif");

//Le reste (un entier négatif et un entier positif), donnera toujours un signe de produit négatif
			
		else 
		System.out.println("Le produit est négatif");

 		
 	}
 }