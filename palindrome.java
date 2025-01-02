import java.util.Scanner;
public class palindrome{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the string: ");
        String input = scanner.nextLine();

        if(ispalindrome(input)){
            System.out.println("\" "+input+ "\" is a palindrome");
        }else{
            System.out.println("\" "+input+ "\" is not a palindrome");
        }
         scanner.close();
    }
         public static boolean ispalindrome(String str){
           // str = str.replaceAll("\\s+", "").toLowerCase();
            str = str.replaceAll("\\s+", "").toLowerCase();
            int left = 0;
            int right = str.length()-1;
            while(left<right){
                if(str.charAt(left)!=str.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
         }
    }
