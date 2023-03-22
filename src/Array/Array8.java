package Array;

// resize an  array using array

import java.util.Scanner;

public class Array8 {
    Scanner sc = new Scanner(System.in);

    // resize an array
    public int[] resizeArray(int[] arr) {
        System.out.println("Enter resize array length: ");
        int size = sc.nextInt();
        int[] temp = new int[size];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    //print array
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //input array
    public int[] inputArray() {
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Main method
    public static void main(String[] args) {
        Array8 a1 = new Array8();
        int[] arr = a1.inputArray();
        a1.printArray(arr);
        int[] arr2 = a1.resizeArray(arr);
        a1.printArray(arr2);
    }
}
