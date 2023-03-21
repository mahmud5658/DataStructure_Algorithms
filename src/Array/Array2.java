package Array;

// array create assign and print using java

public class Array2 {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public void arrayDemo(){
        int [] arr = new int[]{10,20,30,40,50};
        printArray(arr);
    }
    public static void main(String[] args) {
        Array2 a1 = new Array2();
        a1.arrayDemo();
    }
}
