import java.util.Scanner;

public class Saison {
 
  public static void main(String[] args) {
	
	int day;
	int month;

 	java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Rentrez le jour");		
			day = Integer.parseInt(sc.nextLine());

		System.out.println("Rentrez le mois");		
			month = Integer.parseInt(sc.nextLine());	

    printSeason(day, month);
  }

  public static void printSeason(int day, int month) {
    int format = month * 100 + day;
    if (format <= 319) {
        System.out.println("Hiver");
    }
    else if (format <= 619) {
        System.out.println("Printemps");
    }
    else if (format <= 921) {
        System.out.println("Ete");
    }
    else if (format <= 1220) {
        System.out.println("Automne");
    }
    else {
        System.out.println("Hiver");
    }
  }
}