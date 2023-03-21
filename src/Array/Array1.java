package Array;


// adding or updating elements in a One-Dimensional Array
public class Array1 {

    //print array
    public void printArray(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }
    //create and value assign of array
    public void arrDemo() {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[2] = 9;
        printArray(arr);
    }
    // main method
    public static void main(String[] args) {
        Array1 a1 = new Array1();
        a1.arrDemo();
    }
}
