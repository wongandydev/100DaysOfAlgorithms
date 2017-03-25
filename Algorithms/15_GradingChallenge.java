import java.util.Scanner;

public class GradingChallenge {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int a = 0; a < n; a++){
            int grade = in.nextInt();
            System.out.println(mod(grade));
        }
    }
    
    private static int mod(int grade){
        if(grade < 38) return grade; //If it doesn't meet cut off of 38 to to boost grade, not 40 because it is possible to boost after. And anything before 38 will still bring to failing grade
        switch(grade % 5){ //Multiple of five since what the remainder is will be the number you need to add to get to multiple of 5
            case 3:
                grade += 2;
                break;
            case 4:
                grade += 1;
                break;
            default:
                break;
        }
        return grade;
    }
    
}
