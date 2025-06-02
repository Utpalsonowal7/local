import mypack.Myclass;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int rows = scan.nextInt();

        System.out.println("Enter cols: ");
        int cols = scan.nextInt();

        System.out.println(" Please enter " + rows * cols + " elements :");
        int[][] numbers = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = scan.nextInt();
            }
        }

        Myclass util = new Myclass();
        int max = util.findMax(numbers);

        System.out.println("The max element is : " + max);
    }
}