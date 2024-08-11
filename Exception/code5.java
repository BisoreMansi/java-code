import java.util.Scanner;
class code5
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Value Of number");
        int n = s.nextInt();
        try {
            System.out.println(10/n);
            String name = null;
            System.out.println(name.length());
        }
        catch (ArithmeticException e) {

            System.out.println(e);
        }
         catch (Exception e) {
            System.out.println(e);
        }
      

        
    }
    
}
