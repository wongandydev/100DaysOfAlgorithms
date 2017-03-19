import java.util.Scanner;


public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] inputTime = time.split(":"); //Splits input by ":", placing the array to three parts hh, mm ,ss
        String hour = inputTime[0];
        String minute = inputTime[1];
        String second = inputTime[2].substring(0,2);
        
        int tHour; //Because hour is a string right now, in order to compare we need to change it to an int.
        
        //equalsIgnoreCase with ignore if the comparisons have same length and corresponding charaters in two strings.
        if(inputTime[2].substring(2, 4).equalsIgnoreCase("PM")){ //if the last two characters of the array is PM, then it will run code below. Which checks that the number is less than 12.
            if (Integer.parseInt(hour) < 12){ //converts String hour ("12") to int (12)
                tHour = Integer.parseInt(hour);
                tHour += 12;
                hour = Integer.toString(tHour);
            }
        }
        if(inputTime[2].substring(2,4).equalsIgnoreCase("AM")){ //if the last two character is AM, then we don't need to worry about hour. We only need to worry when it is midnight(12AM)
            if (Integer.parseInt(hour) == 12){
                hour = "00";
            }
        }
        
        System.out.print(hour + ":" + minute + ":" + second);
    }
}
