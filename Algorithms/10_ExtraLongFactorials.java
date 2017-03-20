import java.util.Scanner;
import java.math.BigInteger;

public class ExtraLongFactorials{
    public static void main (String []args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger factorial = BigInteger.valueOf(1); //set this to BigInt so it can hold large number not just 1
        
        for (int a = n; a > 0; a--)
        { 
                    
            factorial = factorial.multiply(BigInteger.valueOf(a));

        }
        System.out.println(factorial);
    }
}