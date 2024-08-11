// class Outer
// {
//     private int a =10; int b=20;
//     void m1()
//     {
//         System.out.println("This is outer class MEthod");
//     }
//     class Inner
//     {
//         int a =100;
//         int b=200;
//         void add(int a,int b)
//         {
//             System.out.println(a+b);
//             System.out.println(this.a + this .b);
//             System.out.println(Outer.this.a + Outer.this.b);
//         }
    
//     }
// }
// class Driver
// {
//     public static void main(String[] args) {
//         // Outer o = new Outer();
//         // Outer.Inner i = o.new Inner();
//         // i.add(100,800);
//         new Outer().new Inner().add(1000,2000) ;
//     }
// }