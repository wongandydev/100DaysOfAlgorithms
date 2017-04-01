import java.util.Scanner;
import java.util.HashSet;

public class WeightedUniformString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int numOfQueries = in.nextInt();
        HashSet<Integer> weights = getWeights(str);
        while (0 < numOfQueries--) //Don't need to write for loop, just go down in numbers
        {
            int x = in.nextInt();
            System.out.println(weights.contains(x) ? "Yes" : "No"); //Does weights Hashset contain result we want? 
            //Use .contains() instead of writing for loop to interate through for loop and find that result, costs time. 
        }
    }
    
    private static HashSet<Integer> getWeights(String str)
    {
        HashSet<Integer> weights = new HashSet<>();
        int weight = 0;
        char previous = ' ';//Prevent matches 
        for(int i = 0; i < str.length(); i++) //This will add the result everytime there is an additional same letter. 
        {
            char current = str.charAt(i);
            if(current != previous) //If letter has no reoccurance, we will set weight to 0 and follow code before to add to HashSet
            {
                weight = 0;
            }
            weight += current - 'a' + 1; //ASCII table. z -a = 25, so need to add one for 26
            weights.add(weight);
            previous = current; //Sets previous to current so we can see if the next char is the smae to get weight result.
        }
        return weights;
    }
}