package Array;
import java.util.Scanner;
public class Summation {
    public static void main(String[] args) {
        int[] number = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        for(int i=0;i<5;i++){
            number[i] = sc.nextInt();
        }
        System.out.println("You entered: ");
        for(int i=0;i<5;i++){
            System.out.println(number[i]);
        }
    }
}
