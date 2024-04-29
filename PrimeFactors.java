package day5;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input= sc.nextInt();
        for(int i=2;i<input;i++){
             if(input % i==0){
                 System.out.print(i+" ");
                 input=input/i;
             }
        }sc.close();
    }
}
