package Array;

import java.util.Scanner;

public class Array7 {
    Scanner sc = new Scanner(System.in);

    //input array
    public int[] inputArray() {
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // move zero end of the array
    public int[] moveZeros(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        return arr;
    }

    //print array
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // main method
    public static void main(String[] args) {
        Array7 a1 = new Array7();
        int arr[] = a1.inputArray();
        System.out.println("Your entered array: ");
        a1.printArray(arr);
        int[] result = a1.moveZeros(arr);
        System.out.println("Move zeros to end of the array: ");
        a1.printArray(result);
    }
}
