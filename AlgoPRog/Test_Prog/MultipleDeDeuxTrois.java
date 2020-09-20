import javax.swing.JOptionPane;
class MultipleDeDeuxTrois {

  public static void main(String[] args) {
     java.util.Scanner sc = new java.util.Scanner(System.in);

     double test;

      System.out.println("Rentrez votre nombre entier :");
      test = Integer.parseInt(sc.nextLine());

           test(args[0]);

       }

       public static void test(String s) {
           if (checkIfNumber(s) && (s != null || !s.isEmpty())) {
               System.out.println("nombre entré");
           } 
           else {
               System.out.println("pas de nombre");
           }
       }

       private static boolean checkIfNumber(String s) {
           try {
               Double.parseDouble(s);
           } catch (NumberFormatException ex) {
               //
               JOptionPane.showMessageDialog(null, "nombre non valide");
               return false;
           }
           return true;
       }
    }