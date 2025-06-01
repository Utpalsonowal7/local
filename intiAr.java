import java.util.*;

public class intiAr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the array size");
        int size = scan.nextInt();

        System.out.println("Emter the " + size + " elements : ");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        System.out.println("You'r entered");
        for (int i = 0; i < size; i++) {
            System.out.println("elements are " + " : " + numbers[i]);
        }
    }
}