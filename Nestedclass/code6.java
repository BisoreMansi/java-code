class Outer6
{
    void m1()
    {
        class Inner1
        {
            void software()
            {
                System.out.println("Software class");
            }
        }
        class Inner2 extends Inner1
        {
            void programming()
            {
                System.out.println("Programming class");
            }
        }
        Inner2 i = new Inner2();
        i .software();
        i.programming();
    }
    public static void main(String[] args) {
        Outer6 o = new Outer6();
        o.m1();
    }
}
