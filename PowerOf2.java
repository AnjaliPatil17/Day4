package day5;

public class PowerOf2 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);  //convert string to integer for cmd line argument

        if (0 <= n && n < 31) {

            for (int i = 0; i <n+1; i++) {
                System.out.println("2 to the power " +i+  " is " +Math.pow(2,i));
            }
        }
        else  {
            System.out.println("Out of range");
        }

    }
}
