import java.util.Scanner;

public class Pangrams
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
    }
    
    protected static String getOutput(String s) //No public access, availabe for subclass, package and everything but world. 
    {
        return (isPangram(s)) ? "pangram" : "not pangram";
    }
    
    protected static boolean isPangram(String s)
    {
        String lowerCaseS = s.toLowerCase();
        for(char letter = 'a'; letter <= 'z'; letter++)
        {
            if(lowerCaseS.indexOf(letter) < 0) return false; //if letter does not exist/not found, will return -1 which means, not in alphabet.
        }
        return true;
    }
}
