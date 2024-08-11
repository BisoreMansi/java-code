import java.util.Scanner;
public class _9index {
    public static int evenodd(int num){
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
return 0;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
         evenodd( num);
         a.close();
    }
}
