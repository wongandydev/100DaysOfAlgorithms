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
        
        
        
    }
    
}