import java.util.Scanner;
public class CircleCalculations{
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = 2*Math.PI*radius;
        double area = Math.PI*Math.pow(radius,2);

        System.out.println("The cirumference of the circle: "+circumference);
        System.out.println("The area of the circle: "+area);
        scanner.close();
    }
}