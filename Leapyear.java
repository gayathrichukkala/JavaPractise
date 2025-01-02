import java.util.Scanner;
public class Leapyear{
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter the year: ");
    int year = scanner.nextInt();

    //Scanner.nextline();
    boolean isLeapyear = (year %4 ==0 && year % 100!=0)||(year % 400==0);

    if(isLeapyear){
        System.out.println(year + "is a leap year");
    }else{
        System.out.println(year + "is not a leap year");
    }
    scanner.close();
}
}