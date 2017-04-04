import java.util.Scanner;

public class AlternatingCharacters
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int a = 0; a < testCase; a++)
        {
            System.out.println(deletion(in.next()));
        }
    }
    
    public static int deletion(String a)
    {
        int count = 0;
        char[] stringToArray = a.toCharArray();
        for(int i = 0; i < stringToArray.length - 1 ; i++)
        {
            if(stringToArray[i] == stringToArray[i+1])
            {
                count++;
            }
        }
        return count;
    }
}