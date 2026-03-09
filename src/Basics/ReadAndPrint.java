package Basics;

import java.util.Scanner;

public class ReadAndPrint {
    public static void main(String[] args) {
        // scanner
        Scanner scan = new Scanner(System.in);
        // sop
        System.out.print("Enter number: ");
        // read input
        int num = scan.nextInt();
        // print result
        System.out.print("You entered: " + num);
        // close scanner
        scan.close();
    }
}