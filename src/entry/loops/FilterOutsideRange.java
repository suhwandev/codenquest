package entry.loops;

import java.util.ArrayList;
import java.util.List;
/*
* 1. lowerBound와 upperBound 범위에 해당하는 배열 요소를 담기 위한 ArrayList 초기화
* 2. array를 순회하여 ArrayList에 배열 요소를 담고
* 3. List에 담긴만큼 새로운 배열을 초기화해주고 순회하여 List의 요소를 배열에 넣어준 뒤 반환
* */
public class FilterOutsideRange {
    public int[] filterOutsideRange(int lowerBound, int upperBound, int[] array) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowerBound || array[i] > upperBound) {
                resultList.add(array[i]);
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}
