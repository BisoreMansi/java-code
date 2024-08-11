class Student {
    static String college = "Chameli Devi Group of Institution";
    String name;
    static{
        System.out.println("hey");
    }
    Student(String name) {
        this.name = name;
        System.out.println(name);

    }
    public void showdata2()
    {
        System.out.println("third method");
    }
    static void showdat()
    {
        // System.out.println(name);
        System.out.println(college);
    }
    static public void showdata()
    {
        System.out.println("second static");
        showdat();
        
    }
}

class diver1 {
    public static void main(String[] args) {
        Student s = new Student("mansi Bisore");
        Student.showdata();

    }
}