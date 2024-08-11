// -- Exception handling is a mechanism in Java that allows developers to handle 
// and recover from errors and exceptional conditions that may occur during the execution of a program. 
// -- One way to handle exceptions in Java is by using the try-catch block.
class Code1
{

    public static void main(String[] args) 
    {
        try {
            System.out.println("hey Mansi");
            System.out.println("You are in Infobeans");
            System.out.println(10/0);
            // System.out.println("Girls batch");//not print because it is going into catch
            
        } catch (Exception e) {
            // TODO: handle exception
            // System.out.println(e);//normal Termination
            // e.printStackTrace();
            e.toString();
            e.getMessage();
          
         

        }
        System.out.println("Learn Something");
    }
}