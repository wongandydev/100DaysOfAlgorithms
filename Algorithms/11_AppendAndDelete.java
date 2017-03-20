import java.util.Scanner;


public class AppendAndDelete
{   
    
    public static void main (String []args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next(); 
        String t = in.next();
        int k = in.nextInt(); //number of operations that needs to be completed. 
        int commonWordLength = 0;
        
        for(int i = 0; i < java.lang.Math.min(s.length(), t.length()); i++)
        {
            if(s.charAt(i) == t.charAt(i))
            {
                commonWordLength++;
            }
            else
            {
                break;
            }
        }
        
        if ((s.length() + t.length()) - 2 * commonWordLength > k) // if the the total length of the two word deduct the common * 2 (since the common word is for s and t. and it is greater than k which is the number of operations we can use, then it won't work
        {
            System.out.println("NO");
        }
        else if(((s.length() + t.length()) - 2 * commonWordLength)%2 == k%2) //If the total length of two word deduct common *2 then using % for the whole thing is the same as the opertion % 2 then they have the same amount of operation that need to be done.
        {
            System.out.println("YES");
        }
        else if((s.length() + t.length()) - k < 0) //This is for the empty strings; if the two lengths add together minus k is less than 0 it would be an empty string. So empty string is going to be YES. 
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}