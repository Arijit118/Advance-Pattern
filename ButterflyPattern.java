package AdvancePattern;

public class ButterflyPattern {
    public static void printButterflyPattern(int n) {
        //Print First  half 
        for(int i=1; i<=n; i++) {
            //print i star
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //print spaces 2*(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //print i star
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Print second half
        for(int i=n; i>=1; i--) {
            //print i star
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //print spaces 2*(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //print i star
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]) {
        printButterflyPattern(4);
    }
}
