package Array;

// find  the second-largest element in an array

import java.util.Arrays;

public class Array14 {
    // find the second-largest number
    public void find2Large(int[] arr) {
        int size = arr.length;
        if (size < 2) {
            System.out.println("Invalid input");
            return;
        }
        Arrays.sort(arr);
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] != arr[size - 1]) {
                System.out.println("The second largest elements is:  " + arr[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Array14 a1 = new Array14();
        int[] arr = {12, 35, 1, 10, 34, 1};
        a1.find2Large(arr);
    }
}
