package entry.algorithm;

public class MaxSumOfSubArray {
    public static int maxSumSubarray(int[] numbers, int size) {
        int maxSum = 0;
        for (int i = 0; i < size; i++) {
            maxSum += numbers[i];
        }

        // 슬라이딩 윈도우를 사용해 나머지 배열 탐색
        int windowSum = maxSum;
        for (int i = size; i < numbers.length; i++) {
            windowSum += numbers[i] - numbers[i - size];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 7, 8, 3};
        int size = 3;
        System.out.println(maxSumSubarray(numbers, size));
    }
}
