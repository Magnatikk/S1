public class Cercle {
	
// On déclare la constante PI

	final static double PI=3.14;
	
	public static void main(String[] args) {

//On déclare la varible correspondant au rayon

		double r;

//On demande à l'utilisateur de rentrer la valeur du rayon

		java.util.Scanner
		RayonCercle = new java.util.Scanner(System.in);	
		
		System.out.println("Entrez le rayon du cercle : ");
	
//On associe r à la valeur rentrée

		r = Double.parseDouble(RayonCercle.nextLine());		

//On fait ressortir en print la circonférence et l'aire du cercle calculée depuis la valeur rentrée

		System.out.println("La circonférence du cercle est : " + (2*PI*r) );
		System.out.println("L'aire du cercle est : " + (PI*r*r) );

	}
}