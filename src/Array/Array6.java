package Array;

// find second maximum number from an array

import java.util.Scanner;

public class Array6 {
    Scanner sc = new Scanner(System.in);

    //input array
    public int[] inputArray() {
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // printArray
    public void printArray(int[] arr) {
        System.out.println("Your entered array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // find second maximum number

    public int findSecondMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    // main method
    public static void main(String[] args) {
        Array6 a1 = new Array6();
        int[] arr = a1.inputArray();
        int secondMax = a1.findSecondMaximum(arr);
        System.out.println("Second maximum number : " + secondMax);
    }
}
