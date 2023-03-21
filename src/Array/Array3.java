package Array;

// remove even integer from an array

import java.util.Scanner;

public class Array3 {
    Scanner sc = new Scanner(System.in);

    // remove even number
    public int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    //input array method
    public int[] arrayInput() {
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // print array method
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // main method
    public static void main(String[] args) {
        Array3 a1 = new Array3();
        int[] arr = a1.arrayInput();
        System.out.println("Your entered array: ");
        a1.printArray(arr);
        int[] result = a1.removeEven(arr);
        System.out.println("Removed even number from array ");
        a1.printArray(result);
    }
}
