import java.util.Scanner;

public class Staircase{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int a = 1; a <= n; a++)//Layout
        {
            for (int b = n - a; b > 0; b--)
            {
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
