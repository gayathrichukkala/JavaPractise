import java.util.Scanner;
public class Reverse{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the sentence: ");
     String sentence = scanner.nextLine();
     String[] words = sentence.split(" ");
     StringBuilder reversedSentence = new StringBuilder();
     for(int i= words.length-1; i>=0; i--){
     reversedSentence.append(words[i]).append(" ");
    
     }
        System.out.println("Reversed sentence: "+ reversedSentence.toString().trim());
        scanner.close();
    }
}