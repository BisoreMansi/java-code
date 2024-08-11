// class Outer {
//     Outer() {
//         System.out.println("Outer Class Constructor");
//     }

//     static {
//         System.out.println("Outer Static Block");
//     }
//     {
//         System.out.println("Outer Instance Block");
//     }

//     class Inner {
//         Inner() {

//             System.out.println("Inner Class Constructor");
//         }

//         {
//             System.out.println("Inner Instance Block");
//         }
//     }
// }

// class Driver1 {
//     public static void main(String[] args) {
//         Outer o = new Outer();
//         Outer.Inner i = o.new Inner();

//     }

// }