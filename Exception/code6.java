public class code6
{
    public static void main(String[] args) {
       
       try {
        int arr [] = new int[5];
        
        arr[5]=30/0;
        
       }
     catch (ArithmeticException e) {
        System.out.println("Arthmetic Exception Occur");
       
       } 
       catch(ArrayIndexOutOfBoundsException e)
       {
        System.out.println("ArrayIndexOutofBoundException occur");
       }
       catch(Exception e)
       {
        System.out.println("Parent Exception Occur");
        System.out.println(e);
       }

    }
    
}
 