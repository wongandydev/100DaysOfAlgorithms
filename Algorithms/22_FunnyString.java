import java.util.Scanner;

public class FunnyString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int a = 0; a < testCase; a++)
        {
            String s = in.next();
            System.out.println(isFunny(s) ? "Funny" : "Not Funny");
        }
    }   
    
    protected static boolean isFunny(String s)
    {
        boolean check = true;
        int start = 0;
        int end = s.length()-1;
        
        while(start <s.length()-2) //Do not want to go out of range.
        {
            int first =(int)s.charAt(start);
            int sec = (int)s.charAt(start+1);
            int last = (int)s.charAt(end);
            int last_sec = (int)s.charAt(end-1);
            
            if(Math.abs(first-sec) != Math.abs(last-last_sec))
            {
                check = false;
            }
            start++;
            end--;
        }
        if(check == true)
        {
            return true;
        }
        return false;
    }
}