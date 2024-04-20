package entry.strings;

public class CheckLastCharacter {
    public boolean lastCharCheck(String text) {
        char lastChar = Character.toUpperCase(text.charAt(text.length() - 1));
        if (lastChar == 'C' || lastChar == 'Q') return true;
        else return false;
    }

    public static void main(String[] args) {
        CheckLastCharacter checker = new CheckLastCharacter();
        System.out.println(checker.lastCharCheck("HelloC"));
        System.out.println(checker.lastCharCheck("HelloQ"));
        System.out.println(checker.lastCharCheck("Hello"));
        System.out.println(checker.lastCharCheck("c"));
    }
}
