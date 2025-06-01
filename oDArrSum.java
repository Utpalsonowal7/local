import java.util.*;

public class oDArrSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter the 5 elements of the array : ");
        for (int i = 0; i < 5; i++) {
            arr[i] = scan.nextInt();
        }

        //to find max , min and sum of elemts of array in java

        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];

            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
        }



        System.out.println("The sum of the array elements are : " + sum);

        System.out.println("The maximum of the array elements is : " + max);

        System.out.println("The minimum of the array elements is : " + min);
    }
}