package AdvancePattern;
import java.util.*;
public class NumberPyramid {
    public static void printNumberPyramid(int n) {
        //Outer loop for no. of line
        for(int i=1; i<=n; i++) {
            //inner loop for print spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //print number
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumberPyramid(n);
    }
}
