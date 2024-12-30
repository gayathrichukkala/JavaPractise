import java.util.Scanner;

public class remainder{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        
            System.out.println("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = scanner.nextInt();
            int remainder = num1 % num2;
            System.out. println("remainder when "+num1+" is divided by" +num2+" is:" + remainder);
            scanner.close();
        
           }
}
