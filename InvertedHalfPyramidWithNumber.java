package AdvancePattern;

public class InvertedHalfPyramidWithNumber {
    public static void printInvertedHalfPyramid(int n) {
        for(int i=1; i<=n; i++) {
            //For print number
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            //For print space
            /* 
            for(int j=1; j<=i-1; j++) {
                System.out.print(" ");
            }
            */ 
            System.out.println();
        }
     }
    public static void main(String args[]) {
        printInvertedHalfPyramid(5);
    }
}
