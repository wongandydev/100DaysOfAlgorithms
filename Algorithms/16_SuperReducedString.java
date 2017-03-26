import java.util.ArrayList;
import java.util.Scanner;

public class SuperReducedString
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        String stdin = in.next();
        String holder = "";
        
        for(int a = 0; a < stdin.length(); a++){
            char hold = stdin.charAt(a);
            if(holder.length() > 0 && holder.charAt(holder.length() - 1) == hold){ //This is to check if there is anything in our holder to see if it is empty, if not, it will check the last char we added with the current new char to see if equal
                holder = holder.substring(0, holder.length() - 1); //If it is, then we will basically subscript holder so we keep everything from first char to the char that we just tested, not including it to remove it. 
            }
            else{
                holder += hold; //Adds to holder if it there is nothing there and if it does equa. 
            }
        }
        System.out.println(holder.isEmpty()? "Empty String" : holder); //if holder is empty, print "Empty String" else print holder. 
    }
}