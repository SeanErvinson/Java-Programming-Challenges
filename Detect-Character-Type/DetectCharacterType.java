/**
 * DetectCharacterType
 */
public class DetectCharacterType {
    public static void main(String[] args) {
        String[] phrases = {"Hello", "1234", "@#", "A", "hehe", "ah" };

        for (String phrase : phrases) {
            char symbol = phrase.toLowerCase().charAt(0);
            String type;
            
            if(symbol == 'a' || symbol == 'e'|| symbol == 'i'|| symbol == 'o'|| symbol == 'u')
                type = "Vowel";
            else if(Character.isLetter(symbol))
                type = "Consonant";
            else if(Character.isDigit(symbol))
                type = "Digit";
            else
                type = "Symbol";
            System.out.println(String.format("%s first character is a: %s",phrase, type));
        }
    }
}