package NumberPrograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Year");
        int year = scan.nextInt();
        boolean isLeapYear = false;
        if(year%4 == 0) {
            if(year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }

        if (isLeapYear) System.out.println(year + " is a leap year");
        else System.out.println(year + " is a not leap year");

    }
}
