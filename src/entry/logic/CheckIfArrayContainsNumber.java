package entry.logic;

public class CheckIfArrayContainsNumber {
    public boolean arrayContainsNumber(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) return true;
        }
        return false;
    }
}
