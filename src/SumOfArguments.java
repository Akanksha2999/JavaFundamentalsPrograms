public class SumOfArguments {
    public static void main(String a[]) {

        //Initialized variables
        int n, cnt = 0, sum = 0;
        for (int i = 0; i < a.length; i++) {
            try {
                n = Integer.parseInt(a[i]);
                sum = sum + n;
            } catch (NumberFormatException e) {
                cnt++;
            }
        }

        /*Printing sum of valid arguments and printing number of invalid integers*/
        System.out.println("Sum of only valid integers is= " + sum);

        System.out.println("Invalid integers are: " + cnt);
    }
}
