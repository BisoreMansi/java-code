public class code9
 {
    class Inner9
    {
        public static void main(String[] args) {
            System.out.println("we can execute main method in static inner class");
            
        }
        
    }
    public static void main(String[] args) {
       Inner9.main(args);
    }
    
    
}
