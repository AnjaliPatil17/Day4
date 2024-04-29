package day5;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int headcount=0,tailcount=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of flip: ");
        int Number=sc.nextInt();
        for(int i=0;i<=Number;i++){
            if(Math.random()<0.5){
                headcount++;
            }else{
                tailcount++;
            }
        }sc.close();
        System.out.println("headcount: "+headcount);
        System.out.println("tailcount: "+tailcount);

        double headpercentage=((double)headcount/Number)*100;
        System.out.println(headpercentage);

        double tailpercentage=((double)tailcount/Number)*100;
        System.out.println(tailpercentage);

    }
}
