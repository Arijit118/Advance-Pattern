package AdvancePattern;
import java.util.*;
public class HollowRectangle {
    public static void printHollowRectangle(int totRows, int totCols) {
        for(int i=1; i<=totRows; i++) {
            for(int j=1; j<=totCols; j++) {
                if(i==1||j==1||i==totRows||j==totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Rows: ");
        int n = sc.nextInt();
        System.out.println("Enter total columns: ");
        int m = sc.nextInt();
        printHollowRectangle(n, m);
    }
}
