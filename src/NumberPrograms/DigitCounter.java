package NumberPrograms;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int temp = scan.nextInt();
        int count = 0;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println(count);
    }
}
