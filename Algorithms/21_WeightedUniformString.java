import java.util.Scanner;

public class WeightedUniformString
{
    protected static boolean checkQueries(int queries)
    {
//        for(int b = 0; b < numOfQueries; b++)
//        {
//            //int count = b;//Don't think we need this.
//            for(int c = 0; c < numOfQueries; c++)
//            {
//                if(weights[b] == weightResult[c])
//                {
//                    
//                }
//            }
//        }
        return false;
    }
    
    protected static void weightedUniform(String a)
    {
        char[] b = a.toCharArray();
        char[] c = new char[a.length()];
        for(int i = 0; i < a.length();i++){//Check how many of the same letter is there. 
            int e = i;
            for(int d = 0; d < c.length; d++)
            {
                if(b[e] != c[d]);
            }
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int numOfQueries = in.nextInt();
        
        weightedUniform(input);
        
//        int[] weights = new int[numOfQueries];//Query of expected weight 
        int[] weightResult = new int[numOfQueries]; //Where we place the results from string uniform to perform check and produce result.
        
        for(int a = 0; a < numOfQueries; a++) //Add Weight result to array for easier check
        {
//            int weight = in.nextInt();
//            weights[a] = weight;
            System.out.println(getOutput(a));
        } 
        
        
    }
    protected static String getOutput(int queries)
    {
        return(checkQueries(queries)) ? "Yes" : "No";
    }
}