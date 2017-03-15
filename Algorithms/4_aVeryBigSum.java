import java.util.Scanner;

public class aVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        long sum = 0; //Used long because int holds up to ten digits, long can hold up to 
        
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
    }
}
