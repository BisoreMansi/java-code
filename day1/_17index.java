import java.util.Scanner;
public class _17index {
    public static void odd(int num){
        int var=0,count=0;
        do{
            var=num%10;
           if( var%2 != 0){
            count++;
            num= num/10;
            
           }
        //    num= num/10;
        }while(num!=0);
        
        if(count>0){
        System.out.print("total odd number:"+ count);}
        else{
            System.out.print("total odd number: 0");
        }

    }
    public static void main(String[] args) {
        Scanner od = new Scanner(System.in);
        System.out.println("enter a number for searching odd number");
        int num = od.nextInt();
        odd(num);
        od.close();
        
    }
    
}
