package day5;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        System.out.println("The Quotient of "+num+" is "+(num/10));
        System.out.print("The Remainder of "+num+" is "+(num%10));
        sc.close();
    }
}
