abstract class Shape{
    abstract void getdata();
    
}
class fruit
{
    public static void main(String[] args) {
        Shape s = new Shape(){

            public void getdata()
            {
                System.out.println("in get");
            }
        };
        s.getdata();
    }
}