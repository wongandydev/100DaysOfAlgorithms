import java.util.Scanner;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next().toUpperCase();
        //Since it will be a multiple of three. We need to split the array to threes to compare. So we split it by threes, the elements inside doesn't equal SOS count++
        int count = 0;
        for(int a = 0; a < s.length(); a++)
        {
            char c= s.charAt(a);
            if((a %3) % 2 == 0) //CHECK EVERY OTHER TO SEE IF IT EQUALS S. Since, 0, 2, 4,5 would equal to 0. Also prompt mention modulo 3 already. using modulo 2 is because its every other. 
            {
                if(c != 'S')count++;
            }
            else
            {
                if(c != 'O') count++;
            }
        }
        System.out.println(count);
    }
}
