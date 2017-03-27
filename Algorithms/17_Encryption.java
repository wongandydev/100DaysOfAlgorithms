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
        
        for(int a = 0; a < ceilNum; a++) //We don't need to check if grid size works because we already know the largest is ceilNum. Also since we are not printing the grid but the result in a line. "Checking if it work's won't matter since setting the column size to be the largest will help
        {
            int b = a; //Use as a placeholder to add number to print.
            while (b < beforeEncrypt.length()) //Make sure we are not going past the size of the word.
            {
                System.out.print(arr[b]);
                b += ceilNum; //Since ceilNum is largest, if we went by grid, the next number would be current + ceilNum. 
                count++;
            }
            System.out.print(" ");
        }
        
        
    }
    
}