package AdvancePattern;

public class InvertedRotatedHalfPyramid {
    public static void rotatedHalfPyramid(int n) {
        for(int i=1; i<=n; i++) {
            //For print spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //For print star
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        rotatedHalfPyramid(4);
    }
}
