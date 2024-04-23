package entry.logic;

import java.util.ArrayList;

public class ConcatenateTwoArrays {
    public int[] concatenateArrays(int[] array1, int[] array2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array1) list.add(i);
        for (int i : array2) list.add(i);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) result[i] = list.get(i);
        return result;
    }
}
