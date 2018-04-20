import java.util.HashMap;
import java.util.Scanner;

public class AlphabetFrequencyCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Character, Integer> table = new HashMap<Character, Integer>();
        char[] letterArray;

        System.out.println("Enter paragraph: ");
        // Removes all unnecessary symbols and digits, and made it into a character array
        letterArray = scan.nextLine().replaceAll("[^a-zA-Z]+", "").trim().toLowerCase().toCharArray();
        
        // Add entry to table and increment the key for every identical letter
        for (char letter : letterArray) {
            table.put(letter, table.getOrDefault(letter, 0) + 1);
        }

        System.out.println("Alphabet \tFrequency");
        for (char i = 'a'; i <= 'z'; i++) { 
            System.out.print(String.format("%c/%c", Character.toUpperCase(i), i) + "\t\t");
            // HashMap returns null for characters which are not included in the map
            if (table.get(i) != null)
                System.out.print(table.get(i));
            else
                System.out.print("0");
            System.out.println();
        }
        scan.close();
    }
}