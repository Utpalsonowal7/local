import java.util.*;

public class palimdrome {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();

        int originalvalue = num;
        int reversedValue = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedValue = reversedValue * 10 + digit;
            num = num / 10;
        }

        if (originalvalue == reversedValue) {
            System.out.println(originalvalue + " is a palimdome");
        } else {
            System.out.println(originalvalue + " is not a palimdome");
        }
    }
}