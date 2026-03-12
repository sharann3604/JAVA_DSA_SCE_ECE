package Module6;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};  // Missing 3
        int n = 5;
        int sum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }

        int missing = sum - arraySum;

        System.out.println("Missing number: " + missing);
    }
}