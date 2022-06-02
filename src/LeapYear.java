import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        //Taking year as input from user
        Scanner in = new Scanner(System.in);
        int year;
        System.out.println("Enter the year");
        year = in.nextInt();

        /*Checking if the year is leap year or not and printing it*/
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Its is a leap year");
        } else {
            System.out.println("Its is not a leap year");
        }
    }
}
