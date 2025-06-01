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
        //to find if a number is present or not in an array

        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        System.out.println("Enter the the value you want to serach");
        int targetValue = scan.nextInt();
        boolean found = false;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];

            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
            if (arr[i] == targetValue) {
                System.out.println("number " + targetValue +" found at index of : " + i );
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("number " + targetValue + "is not found");
        }



        System.out.println("The sum of the array elements are : " + sum);

        System.out.println("The maximum of the array elements is : " + max);

        System.out.println("The minimum of the array elements is : " + min);
    }
}