import java.util.Scanner;

public class Encryption 
{
    public static void main (String [] args)
    {
        Scanner stdin = new Scanner (System.in);
        String beforeEncrypt = stdin.nextLine();
        double s = Math.sqrt(beforeEncrypt.length());
        
        int floorNum = (int)(Math.floor(s));
        int ceilNum = (int)(Math.ceil(s));
        
        int count = 0;
        char[] arr = beforeEncrypt.toCharArray();
        
        for(int a = 0; a < ceilNum; a++)
        {
            int b = a;
            while (b < beforeEncrypt.length())
            {
                System.out.print(arr[b]);
                b += ceilNum;
                count++;
            }
            System.out.print(" ");
        }
        
        
    }
    
}