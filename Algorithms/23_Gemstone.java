import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


public class Gemstone
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        
        Set<Character> aToZ = new HashSet<Character> ();
        Set<Character> userSet = new HashSet<Character> ();
        
        for(char a = 'a'; a <= 'z'; a++) //Adds A to Z chat to aToZ set.
        {
            aToZ.add(a);
        }
        
        for(int i = 0; i < testCases; i++)
        {
            userSet.clear();//So we can reuse the same set everytime we go through the for loo[
            char[] testString = in.next().toCharArray();
            
            for (int b = 0; b < testString.length; b++)
            {
                userSet.add(testString[b]);
            }
            
            aToZ.retainAll(userSet); //Only keeps the ones that are in both aToZ and userset. This way the next for loop, it it isn't there, it will be removed since the char must show up once every string. 
        }
        System.out.println(aToZ.size()); //The size is all the number of chars that still exists after for loop.
        
        in.close();
    }
}