import java.util.Scanner;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long[] input = new long[5];
        long sum = 0;
        
        for(int i = 0; i < 5; i++){ //add user input to array input.
            input[i] = in.nextLong();
            sum += input[i];
        }
        
        for(int b = 0; b < input.length; b++){
            System.out.print(input[b]);
        }
        
        System.out.println();
        //Sort Array
        for (int x = 5; x > 0; x--){ //makes the for loop iterate 5 times, which will basically make sure that its sorted correctly, each time going through once. 
            for(int s = 0; s < input.length - 1; s++){
                long temp = 0;
                if (input[s] > input[s + 1]){
                    temp = input[s];
                    input[s] = input[s+1];
                    input[s+1] = temp;
                }
            }
        }
        
        for(int a = 0; a < input.length; a++){
            System.out.print(input[a]);
        }
        
        System.out.println("Min: " + (sum - input[input.length-1]) + " Max:" + (sum - input[0]));
    }
}
