 class Student
{
    String name ;
    int age;
    int Emarks;
    public int data(int jmarks)
    {
        int total = Emarks+jmarks;
        return total;
        
        
    } 
}
class driver1
{
    public static void main()
    {
        Student obj = new Student();
        obj.name="rahul";
        obj.age=12;
        obj.Emarks=16;
        int result = obj.data(16);
        System.out.println(obj.name +" scored"+ result);

    }
}
