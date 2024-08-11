package Constructor;

 class Student
{
    String name;
    int age;
    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void showdata()
    {
        if(age>19)
        {
            System.out.println(name + "you can be in school");
        }
    }
   
}
class driver
{
    public static void main(String[] args) {
        Student o = new Student("Mansi", 22);
        Student o1 = new Student("Mansibisore", 22);
        o1.showdata();
        o.showdata();
    }
}

