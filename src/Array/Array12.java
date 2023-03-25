package Array;

// java code to find the largest three element in the array

import java.util.Scanner;

public class Array12 {
    Scanner sc = new Scanner(System.in);
    // input array
    public int [] inputArray(){
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    // find the largest three number
    public void findLargest(int[] arr){
        int n = arr.length;
        int i,first,second,third;
        first = second = third = Integer.MIN_VALUE;
        if(n<3){
            System.out.println("Invalid input");
            return;
        }
        for(i=0;i<n;i++){
            if(arr[i]>first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                third = second;
                second = arr[i];
            }
            else if(arr[i]>third && arr[i]!=second){
                third = arr[i];
            }
        }
        System.out.println("First large: "+first);
        System.out.println("Second large: "+second);
        System.out.println("Third large: "+third);
    }
    // print array
    public void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    //main method
    public static void main(String[] args){
        Array12 a1 = new Array12();
        int [] arr = a1.inputArray();
        System.out.println("Your entered array: ");
        a1.printArray(arr);
        System.out.println("Largest three number: ");
        a1.findLargest(arr);
    }
}
