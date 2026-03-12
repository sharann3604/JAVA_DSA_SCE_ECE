package Module7;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 8, 12, 3, 7};
        int key = 12;
        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                position = i;
                break;
            }
        }

        if (position != -1)
            System.out.println("Element found at index: " + position);
        else
            System.out.println("Element not found");
    }
}
