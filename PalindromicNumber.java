package AdvancePattern;
import java.util.*;
public class PalindromicNumber {
    public static void printPalindromicNumber(int n) {
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop for spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //inner loop for print number 1st half
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            //inner loop for print number 2nd half
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPalindromicNumber(n);
    }
}
