package day5;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First number: ");
        int first=sc.nextInt();
        System.out.print("Enter second number: ");
        int second=sc.nextInt();
        System.out.print("Enter third number: ");
        int third=sc.nextInt();
        if((first > second) && (first > third)){
            System.out.print(first+" is the largest number.");
        } else if ((second > first) &&(second > third)) {
            System.out.print(second+" is the largest number");
        }else{
            System.out.print(third+" is the largest number");
        }sc.close();
    }
}
