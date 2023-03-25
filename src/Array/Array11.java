package Array;

public class Array11 {
    public static void main(String[] args) {
        int [][] matrix = {{4,5,},{1,3},{8,9}};
        for(int i = 0; i<3; i++){
            for(int j=0;j<2;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
