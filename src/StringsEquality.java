import java.util.Scanner;

public class StringsEquality {
    public static void main(String[] args) {
        /* Takes name1 and name2 input from user and then prints it*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name:");
        String name1 = sc.nextLine();
        System.out.println(name1);

        System.out.println("Enter first name2:");
        String name2 = sc.nextLine();
        System.out.println(name1);

        /* Checks if the strings are equal, if they are equal ,prints true else will print false*/
        System.out.println(name1.equals(name2));
    }
}
