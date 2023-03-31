package Array;
//find sub-array with given sum
public class Array15 {
    // find sub-array method with index
    public static void subArray(int[] arr,int sum){
        int size = arr.length;
        for(int i=0;i<size;i++){
            int currentSum = arr[i];
            if(currentSum==sum){
                System.out.println("Sum found at index "+i);
            }
            else{
                for(int j=i+1;j<size;j++){
                    currentSum+=arr[j];
                    if(currentSum==sum){
                        System.out.println("Sum found between index "+i+" and "+j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subArray found");
    }
    public static void main(String[] args) {
        int [] arr = {15,2,4,8,9,5,10,23};
        int sum = 23;
        subArray(arr,sum);
    }
}
