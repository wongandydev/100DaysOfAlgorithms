import java.util.Scanner;

public class HackerrankInAString
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        int numOfTest = stdin.nextInt();
        for(int a = 0; a < numOfTest; a++)
        {
            String input = stdin.next();
            System.out.println(findHackerrank(input));
        }
        
    }
    
    public static String findHackerrank(String h)
    {
        char[] toChar = "hackerrank".toCharArray();
        int arrayIndex = 0;
        
        for(int i = 0; i < h.length(); i++)
        {
            if(h.charAt(i) == toChar[arrayIndex])//Iterates through input string, but does not iterate toChar since it is hackerrank, only will iterate when it goes through input and looks for first char that matches and goes on so we know what we will have all the letters in the input array.
            {
                arrayIndex++;
            }
            if (arrayIndex == 10) return "YES";  //hackerrank char.size is 10. So if it is 10 we know that we have hackerrank since it wouldn't add one unless they equal.
        }
        return "NO";
    }   
}