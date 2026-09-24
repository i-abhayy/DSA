import java.util.Scanner;

public class linear_search_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int target = 5;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element found at index: " + i);
                break;
            }
        }
    }
}