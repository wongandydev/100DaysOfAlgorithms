/*package whatever //do not write package name here */

import java.io.*;
import java.util.Random;

class ShuffleDeckOfCards {
    public static void main (String[] args) {
        int[] arrA = {0,1,2,3,4,5,6,7,8,9,10,
        11,12,13,14,15,16,17,18,19,20,21,22,23,
        24,25,26,27,28,29,30,31,32,33,34,35,36,
        37,38,39,40,41,42,43,44,45,46,47,48,48,
        50,51,52};
        
        shuffle(arrA);   
    }

    public static void shuffle(int[] arr){
        int temp = 0;
        Random rand = new Random();
        
        for(int i = 0; i < arr.length; i++){
            int swapIndex = rand.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[swapIndex];
            arr[swapIndex] = temp;
        }
    
        for(int a : arr){
            System.out.println(a);
        }
    }
}