import java.util.Scanner;
public class Passwordvalidation{
    public static void main(String[]args){
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the password: ");
   String password = scanner.nextline();
   System.out.println("The password is valid: ");
   double validpassword = scanner.nextDouble();
   System.out.println("The password is invalid: ");
   double invalidpassword = scanner.nextDouble();
      public static boolean isValidPassword(String password){
        return password.length()>=8 &&password.matches(".*[A-Za-z].*") && password.matches(".*\\d.*");
        scanner.close();
    

      }
    }
    
}