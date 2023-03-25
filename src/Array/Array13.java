package Array;

import java.util.Arrays;
import java.util.Scanner;

// find the largest three number in the array
public class Array13 {
    // find the largest three number
    public void findLargestThree(int[] arr) {
        Arrays.sort(arr);
        int size = arr.length;
        int check = 0, count = 1;
        for (int i = 1; i < size; i++) {
            if (count < 4) {
                if (check != arr[size - i]) {
                    System.out.println(arr[size - i] + " ");
                    check = arr[size - i];
                    count++;
                }
            } else {
                break;
            }
        }
    }

    // input array
    public int[] inputArray() {
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of the array:");
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // print array
    public void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Array13 a1 = new Array13();
        int[] arr = a1.inputArray();
        a1.printArray(arr);
        a1.findLargestThree(arr);
    }
}
