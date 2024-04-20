package entry.loops;

public class RepeatString {
    public String repeatString(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RepeatString r = new RepeatString();
        System.out.println(r.repeatString("a", 3));
        System.out.println(r.repeatString("b", 4));
        System.out.println(r.repeatString("hello", 2));
    }
}
