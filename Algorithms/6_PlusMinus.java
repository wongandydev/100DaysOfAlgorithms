import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class PlusMinus {

    public static double getAns(int a, int n){
        return ((double)a) / n;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            if (arr[i] > 0){
                positiveCount++;
            }
            else if (arr[i] < 0){
                negativeCount++;
            }
            else if (arr[i] == 0){
                zeroCount++;
                
            } 
        }
        NumberFormat formatter = new DecimalFormat("#0.000000");
        double ans = getAns(positiveCount, n);
        ;
        System.out.println(formatter.format(getAns(positiveCount,n)) + "\n" +  formatter.format(getAns(negativeCount,n)) + "\n" + formatter.format(getAns(zeroCount,n)));
        
        
    }
}
