import java.util.Scanner;
public class characterfrequency{
    public static void main(String[]args){
        Scanner scanner = new Scanner(Sysem.in);
        System.out.println("Enter the string: ");
            String input = scanner.nextLine();
        HashMap<Character, Integer> frequencyMap = countcharacterFrequency(input);
        System.out.println("character frequency:");
        for(char key: frequencyMap.keyset()){
            System.out.println(key+":" + frequencyMap.get(key));
        }
        scanner.close();
    }
    public static HashMap<character,Integer> countCharacterFrequency(String str){
        HashMap<Character, Integer> frequencyMap= new HashMap<>();

        for (char ch: str.toCharArray()){
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0)+1);
        }
    
        return frequencyMap;
}
    }
