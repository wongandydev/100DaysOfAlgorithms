import java.util.Scanner;

public class diagonalDifference {
    
    public static int getDifference (int a, int b){
        return Math.abs(a - b);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pd = 0;
        int sd = 0;
 
        int a[][] = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int c = 0; c < n; c++){
            pd += a[c][c];
            sd += a[n-c-1][c];
        }
        
        System.out.println(getDifference(pd,sd));
    }
}
