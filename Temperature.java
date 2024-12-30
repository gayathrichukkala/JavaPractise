import java.util.Scanner;
public class Temperature{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature conversion:");
        System.out.println("celusis to Fahrenheit:");
        System.out.println("Fahrenheit to celusis:");
        System.out.println("choose an option (1 or 2)");
        int choice = scanner.nextInt();

        if (choice==1){
        System.out.println("enter the temperature celusis: ");
        double celusis = scanner.nextDouble();
        double Fahrenheit = celusis *(9/5)+32;
        System.out.println("Temperature in fahrenheit:%.2f F%n, fahrenheit");
    }
    else if(choice==2){
        System.out.println("enter the temperature fahrenheit celusis:");
        double Fahrenheit = scanner.nextDouble();
        double celusis = Fahrenheit *(Fahrenheit-32)*(5/9);
        System.out.println("Temperature in celusis:%.2f C%n, celusis");
    }
    else{
        System.out.println("Invalid choice. Please run the program again and choose 1 or 2");
    }
    scanner.close();
}
}