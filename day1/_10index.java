import java.util.Scanner;
public class _10index {
    public static void leap(int year){

        if(year %400==0){
            System.out.println("Leap Year");
        }
        else if(year %100==0){
            System.out.println("Leap Year");
        }
        else if(year %4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println(" Not Leap Year");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a Year:");
        Scanner a = new Scanner(System.in);
        int year = a.nextInt();
         leap( year);
         a.close();
    }
    
}
