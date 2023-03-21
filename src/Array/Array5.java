package Array;

// find minimum value from the array
import java.util.Scanner;

public class Array5 {
    Scanner sc = new Scanner(System.in);

    //find minimum number
    public int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
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

    //print array
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    //main method
    public static void main(String[] args) {
        Array5 a1 = new Array5();
        int[] arr = a1.inputArray();
        a1.printArray(arr);
        int min = a1.findMinimum(arr);
        System.out.println("Minimum number of the array: " + min);
    }
}
