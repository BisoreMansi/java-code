//Static Method in JAVA
//Static method vs non static method
// = remember we can call static method with object reference or class name  e.g 
// ClassName.staticMethod()
//  or 
//  objReference.statiMethod()
// = but non static method dependent on object so it can be called only  by object reference. e.g
//  objReference.nonStaticMethod();

// class a {
//     static String firstname = "Mansi";
//     String lastname = "Bisore";

//     public static void name() {
//         System.out.println("in static method");
//     }

//     public static void main(String[] args) {
//         a e = new a();
//         a.name();

//     }

// }

class a {
    static String firstname = "Mansi";
    String lastname = "Bisore";

    public static void name(a e) {
        System.out.println("in static method");
        System.out.println("first name"+e.firstname+"Second name"+e.lastname);
    }

    public static void main(String[] args) {
        a e = new a();
        a.name(e);

    }

}