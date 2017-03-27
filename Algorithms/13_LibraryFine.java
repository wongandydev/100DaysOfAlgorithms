import java.util.Scanner;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Date Returned
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        //Date expected of return
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        
        int fine = 0;
        
        if(y1 > y2)
        {
            fine = 10000;
        }
        else if(m1 > m2 && y1 == y2){
            fine = 500 * (m1 - m2);
        }
        else if (d1 > d2 && m1 == m2 && y1 == y2){
            fine = 15 * (d1 - d2);
        }
        else{
            fine = 0;
        }
        System.out.println(fine);
    }
}
