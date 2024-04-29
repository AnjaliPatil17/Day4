package day5;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        int temp=0;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.print("after Swaping of numbers are: "+num1+" "+num2);
        sc.close();
    }
}
