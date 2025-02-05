package NumberProgram;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scan.nextInt();
        int temp = num;
        int count = 0;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

            System.out.println(count);
    }
}
