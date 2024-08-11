import java.util.Scanner;
class _15index {
    public static int sum( int a)
    {
        int add=0,c=0;
        do{
             c = a%10;//47%10=7
             add= add+c;//7
            a = a/10;//4


        }while(a>0);
        
    return add;
    }
    public static void main(String args[]){
        Scanner obj= new Scanner(System.in);
        System.out.println("enter a number :");
        int a = obj.nextInt();
        System.out.println("your sum ="+sum(a) );

        obj.close();
    }
}
