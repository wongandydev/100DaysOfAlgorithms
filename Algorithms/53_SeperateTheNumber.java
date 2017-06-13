import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            boolean beautiful = false;
            long firstX = 0;
            
            for(int i = 1; i <= s.length()/2; i++){ //Adds only the first half of the string 
                long x = Long.parseLong(s.substring(0,i));
                System.out.println("x " + x);
                firstX = x;
                
                String test = Long.toString(x);
                System.out.println("test: " + test);
                while (test.length() < s.length()){
                    test += Long.toString(++x);
                    System.out.println("Test2: " + test);
                }
                
                if (test.equals(s)){
                    beautiful = true;
                    break;
                }
            }
             System.out.println(beautiful ? "YES " + firstX : "NO");
        }
    }
}