//Static Inner Class
class Outer8
{
    static int a =5;
    static int b =9;
    static class Inner8
    {
        void disp()
        {
            System.out.println(a);
            System.out.println(b);
        }

    }
    public static void main(String[] args) {
        new Outer8.Inner8().disp();
    }
}