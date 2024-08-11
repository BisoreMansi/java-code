import java.util.Scanner;
public class _8index {
    public static int Addition(int num1,int num2){
        return num1+num2;
    }
    public static int Subtraction(int num1,int num2){
        return num1-num2;
    }
    public static int Multiplication(int num1,int num2){
        return num1*num2;
    }
    public static int Divide(int num1,int num2){
        return num1/num2;
    }
    public static int Modulo(int num1,int num2){
        return num1%num2;
    }
    
    public static void main(String[] args) {

        Scanner val = new Scanner(System.in);
        System.out.println("Enter first num");
        int num1 = val.nextInt();
        System.out.println("Enter Second num");
        int num2 = val.nextInt();
        
        System.out.println("Sum of "+ num1 +" and "+ num2 +" =  "+( Addition( num1, num2)));
        System.out.println("Subtract of "+ num1 +" and "+ num2 +" =  "+(  Subtraction( num1, num2)));
        System.out.println("Multiply of "+ num1 +" and "+ num2 +" =  "+(  Multiplication( num1, num2)));
        System.out.println("Divide of "+ num1 +" and "+ num2 +" =  "+( Divide( num1, num2)));
        System.out.println("Modulo of "+ num1 +" and "+ num2 +" =  "+(Modulo( num1, num2)));
        val.close();
    }
}
