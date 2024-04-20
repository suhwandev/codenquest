package entry.strings;

public class ConcatenateFirstAndLastCharacters {
    public String concatFirstLastChar(String s) {
        return s.charAt(0) + "" + s.charAt(s.length() - 1);
    }

    public static void main(String[] args) {
        ConcatenateFirstAndLastCharacters concatenateFirstAndLastCharacters = new ConcatenateFirstAndLastCharacters();
        System.out.println(concatenateFirstAndLastCharacters.concatFirstLastChar("abc"));
        System.out.println(concatenateFirstAndLastCharacters.concatFirstLastChar("test"));
        System.out.println(concatenateFirstAndLastCharacters.concatFirstLastChar("hello"));
        System.out.println(concatenateFirstAndLastCharacters.concatFirstLastChar("z"));
    }
}
