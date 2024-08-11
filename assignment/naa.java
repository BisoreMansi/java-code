import java.util.Scanner;
class Checkorder {
public void check(){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter any three numbers");
   int first = sc.nextInt();
   int second = sc.nextInt();
   int third = sc.nextInt();
   if((second>first) && (third>second)){
       System.out.println("Increasing Order");
       
   }
   else if((first>second )&& (second>third)){
       System.out.println("Decreasing Order");
       
   }
   else{
       System.out.println("Not Order");
   }
   sc.close();
}


   


   public static void main(String[] args) 
   {
  
       Checkorder ch = new Checkorder();
      ch.check();
    
       
   }
}