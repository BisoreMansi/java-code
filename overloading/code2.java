 class A
{

    public void StudentId(String a, int roll)
    {
        System.out.println("Name :"+ a + "rollnumber :"+ roll);

    }
    public void StudentId(int roll,String a)
    {
        System.out.println("rollnumber :"+ roll+"Name :"+ a  );

    }
    

    public static void main(String[] args) 
    {
       A a = new A();
       a.StudentId(87876, "mansi");
       a.StudentId("mahi",123);
    }
}
