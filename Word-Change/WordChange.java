import java.util.Scanner;

public class WordChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wordLength = 4;
        String changeWord = "Love";
        String sentence;
        String[] sentenceArray;

        do{
            System.out.println("Enter paragraph: ");
            sentence = scan.nextLine();
        }while(sentence.toCharArray().length > 100);
       
        sentenceArray = sentence.split(" ");
        for (String word : sentenceArray) {
            if(word.length() == wordLength && Character.isUpperCase(word.charAt(0)))
                word = changeWord;
            else if(word.length() == wordLength)
                word = changeWord.toLowerCase();
            System.out.print(word + " ");
        }
        scan.close();
    }
}