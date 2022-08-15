package AdvancePattern;

public class SolidRhombus {
    public static void printSolidRhombus(int n) {
        //Print no of line 
        for(int i=1; i<=n; i++) {
            //print spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //print star
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        printSolidRhombus(5);
    }
}
