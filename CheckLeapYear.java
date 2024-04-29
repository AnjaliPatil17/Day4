package day5;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=sc.nextInt();
        if(year >= 1000 && year <= 9999){
            if(year % 4 == 0 && year % 100 !=0 &&  year >= 1582 || year % 400 == 0){
                System.out.print(year + " is a Leap year");
            }else {
                System.out.print(year + " is not leap year");
            }
        }else {
            System.out.print("Invalid input. Please enter a 4-digit year.");
        }sc.close();
    }
}
