import java.util.*;

public class compareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int a = 0; //Alice
        int b = 0; //Bob
        
        if (a0 > b0)
        {
            a += 1;
        }
        else if (a0 < b0)
        {
            b += 1;
        }
        
        if (a1 > b1)
        {
            a += 1;
        }
        else if (a1 < b1)
        {
            b += 1;
        }
        
        if (a2 > b2)
        {
            a += 1;
        }
        else if (a2 < b2)
        {
            b += 1;
        }
        
        System.out.println(a + " " + b);
    }
}
