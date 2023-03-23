package Array;

public class Array9 {
    //Scanner sc = new Scanner(System.in);
    // input array
//    public int[] inputArray() {
//        System.out.println("Enter the size of array: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
//        return arr;
//    }
    // print array
    public void printArray(int [] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    // find missing number
    public int findMissingNumber(int[] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        for(int num:arr){
            sum = sum - num;
        }
        return sum;
    }
    // main method
    public static void main(String[] args){
        Array9 a1 = new Array9();
        int [] arr = {1,2,3,5};
        a1.printArray(arr);
        int missingNumber = a1.findMissingNumber(arr);
        System.out.println(missingNumber);
    }
}
