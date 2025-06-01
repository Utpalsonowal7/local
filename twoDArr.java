import java.util.*;

public class twoDArr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the rows");
        int rows = scan.nextInt();

        System.out.println("Enter the column");
        int cols = scan.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the " + rows * cols + "elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(" The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}