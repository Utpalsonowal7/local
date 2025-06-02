import java.util.*;

class cLineArgu {
    public static void main(String[] args) {
        System.out.println("Enter the 6 element :");

        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            sum += num;
        }
        System.out.println(" the sum is : " + sum);
    }
}