package day5;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.print(num+" is even number.");
        }else{
            System.out.print(num+" is odd number.");
        }sc.close();
    }
}
