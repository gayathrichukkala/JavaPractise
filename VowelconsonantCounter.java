import java.util.Scanner;
public class VowelconsonantCounter{
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the string: ");
    String input = scanner.nextLine();
       int vowel count = 0;
       int consonant count=0;
       input = input.tolowerCase();
       for(int i=0; i<input.length(); i++){
        char ch = input.charAt(i);
        if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u'){
            vowelcount++;
        }
        else if{
            (ch >='a'&& ch <='z'){
             consonantCount;
            }
        }
       }
       System.out.println("number of vowels: "+ vowelCount);
       System.out.println("number of consonants: "+consonantCount);
       Scanner.close();
}
}