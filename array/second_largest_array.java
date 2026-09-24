import java.util.Scanner;

public class second_largest_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int secondMax = arr[0];

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] > max) {
                secondMax = max;
                max = arr[j];

            } else if (arr[j] > secondMax && arr[j] != max) {
                secondMax = arr[j];
            }
        }

        System.out.println("The second largest number is " + secondMax);
    }
}