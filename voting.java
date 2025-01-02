import java.util.Scanner;
public class voting{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine();
        System.out.println("are you citizen of the country? (yes/no) ");
        String citizenship = scanner.nextLine().trim().toLowerCase();
    
        if (age >= 18 && citizenship.equals("yes")){
             System.out.println("you are eligible for voting");
        }else{
            System.out.println("you are not eligible for voting");
        }
        scanner.close();
    }
}