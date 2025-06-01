import java.util.*;

public class one {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter you'r size between 1 to 4");
       int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("too small brother");
                break;
            case 2:
                System.out.println("considerable");
                break;
            case 3:
                System.out.println("average");
                break;
            case 4:
                System.out.println("perfect");
                break;
            default :
               System.out.println("Invalid size");
        }
    }
}