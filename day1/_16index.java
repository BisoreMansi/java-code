import java.util.Scanner;
public class _16index {
    public static int reverse(int num){
        int rev=0,add=0;
        do {
            rev=num%10;
            add=add*10+rev;
            num=num/10;
            
        }  while (num!=0);
        
        return add;
    }
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner on = new Scanner(System.in);
        int num=on.nextInt();

        
        System.out.println("your reverse order:" + reverse (num) );

        on.close();
    }
}
