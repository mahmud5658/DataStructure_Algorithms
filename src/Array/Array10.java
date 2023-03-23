package Array;

import java.util.Scanner;

public class Array10 {
    Scanner sc = new Scanner(System.in);

    //input string
    public String inputString(){
        System.out.println("Enter a string: ");
        return sc.next();
    }

    //string palindrome check
    public boolean isPalindrome(String word){
        char [] charArray = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // main method
    public static void main(String[] args) {
        Array10 a1 = new Array10();
        System.out.println("is sting is palindrome: "+a1.isPalindrome(a1.inputString()));
    }
}
