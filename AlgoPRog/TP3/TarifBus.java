import java.util.*;
import java.text.DecimalFormat;

class TarifBus {
	
	final static 
	
	long enfant = 25,
	 lambda = 120,
	 reduction = 80;


	public static void main(String[] args) {

		int age;
		int location;
		double prix;
		boolean failed = false;

	DecimalFormat df = new DecimalFormat("#.##");
	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.println("Rentrez votre age");
		
	try {
		age = Integer.parseInt(sc.nextLine());
		
		if (age < 0 || age > 122) 
        throw new Exception();

  			}
 			 
 			 catch(Exception e)
  {
     failed = true;
     age = 0;
  }
  if (failed)
  {
     System.out.println("Age non valable");      // Error message it displays
     System.exit(0);
  }
  else {

	System.out.println("Habitez vous à Montreuil ? Tapez 1 pour Oui et 0 pour Non");
		location = Integer.parseInt(sc.nextLine());

		if (age < 3)
			prix = enfant;

		else if ( 20 >= age || age > 65)
			prix = reduction;
			
		else
			prix = lambda;

	if (location == 1)
		System.out.println("Votre prix de ticket est de " + ((prix*0.7)/100));
		

	else if (location == 0)
		System.out.println("Votre prix de ticket est de " + ((prix)/100));
	
	}	
  }
}