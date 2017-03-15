import java.util.Scanner;

class simpleSum{
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number you want to add, enter 0 to stop");
        int sum = 0;
        while (sum >= 0){
            int in = scan.nextInt();
            sum += in;
            if (in == 0){
                break;
            }
        }
        
        System.out.println("The sum is: " + sum);
    }
}