
import java.util.Scanner;
class _1index
{
    public static void main(String[] args)
     {
        System.out.println("Good Morning!");
        int cost = 0;
        char ans = 'y';
        Scanner obj = new Scanner(System.in);
        
        while(ans=='y')
        {
            
        System.out.println("What would you like to Order !");
        System.out.println("Tea , Coffe, Cold Coffe, Sandwich...");
        
        // Scanner obj = new Scanner(System.in);
        String choice = obj.nextLine();
        // System.out.println(out);
          switch(choice)
          {
            case "tea" : System.out.println(" Take your Tea ");
            cost +=10;
            
                break;
            
                case "coffe" : System.out.println(" Take your coffe ");
                cost +=20;
                    break;

                    case "cold coffe" : System.out.println(" Take your cold coffe ");
            cost +=80;
                break;

                case "sandwich" : System.out.println(" Take your sandwich ");
            cost = cost+100;
                break;
                default:System.out.println("Give Valid Input");
          }
          System.out.println("Thank You would you like to Add ANything if yes press y otherwise n");
          char  obj1 = obj.next().charAt(1);
          
          
          if(obj1=='n'){
                break;
          }else{
            ans=obj1;
          }
        }
        System.out.println("Your Total Bill = "+ cost);
        
        obj.close();
    }
}       
       