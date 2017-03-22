import java.util.Scanner;

//QuickerSolution... Solution below is mine, which is what I did it works, but time complexity is too long.
//public class AnotherSolution {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner (System.in);
//        int testCase = in.nextInt();
//        int[] arrA = new int[testCase];
//        int[] arrB = new int[testCase];
//        
//        for (int t = 0; t < testCase; t++){
//            arrA[t] = in.nextInt();
//            arrB[t] = in.nextInt();
//        }
//        
//        for(int a = 0; a < testCase; a++){
//           int count = (int)Math.floor(Math.sqrt(arrB[a])) - (int)Math.ceil(Math.sqrt(arrA[a])) + 1; /Math formula to find number of sqrt in give range.
//           System.out.println(count);
//        }   
//        
//    }
//}


public class SherlockAndSquares {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int testCase = in.nextInt();
        int[] arrA = new int[testCase];
        int[] arrB = new int[testCase];
        int count = 0;
        
        for (int t = 0; t < testCase; t++){
            arrA[t] = in.nextInt();
            arrB[t] = in.nextInt();
        }
        
        for(int a = 0; a < testCase; a++){
            for(int b = arrA[a]; b <= arrB[a]; b++){
                int squareRoot = ((int)(Math.sqrt(b)));
                if((squareRoot * squareRoot) == b){
                    //System.out.println("i" + squareRoot + " " + b);
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}