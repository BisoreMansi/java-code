
import java.util.Scanner;
public class _7index {
    public static void Calculator(int num1,int num2){
        System.out.println("Addition ="+ (num1+num2));
        System.out.println("Subtraction ="+ (num1-num2));
        System.out.println("Multiply ="+ (num1*num2));
        System.out.println("Divide ="+ (num1/num2));
        System.out.println("Modulo1 ="+ (num1%num2));

    }
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("Enter first num");
        int num1 = val.nextInt();
        System.out.println("Enter Second num");
        int num2 = val.nextInt();
         Calculator( num1,num2);
         val.close();
    }
}
