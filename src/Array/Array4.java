package Array;

import java.util.Scanner;

// reverse an array
public class Array4 {
    Scanner sc = new Scanner(System.in);

    //print array method
    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // reverse array method
    public int[] reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    // input array method
    public int[] inputArray() {
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    //main method
    public static void main(String[] args) {
        Array4 a1 = new Array4();
        int[] arr = a1.inputArray();
        System.out.println("Your entered array: ");
        a1.printArray(arr);
        int[] result = a1.reverseArray(arr, 0, arr.length - 1);
        System.out.println("Reverse of array: ");
        a1.printArray(result);
    }
}
