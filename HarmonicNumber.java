package day5;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = sc.nextInt();
        double result=0;
        for (int j=1;j<=input;j++){
            result = result + (1.0/j);
        }sc.close();
        System.out.print(result);
    }
}
