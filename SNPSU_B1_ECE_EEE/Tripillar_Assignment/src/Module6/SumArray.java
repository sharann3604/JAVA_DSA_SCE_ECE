package Module6;
public class SumArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of elements: " + sum);
    }
}
