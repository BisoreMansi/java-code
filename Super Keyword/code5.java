class Person
{
    int id;
    String name;

    Person(int id, String name)
    {
        this.id = id;
        this.name= name;
        
    }
}
class Emp extends Person
{
    float salary;

    Emp(int id, String name,float salary)
    {
        super(id, name);
        this.salary = salary;
        
    }
    void display()
    {
        System.out.println(id+name+salary);
    }
}
class driver0
{
    public static void main(String[] args) {
        Emp e = new Emp(123,"mansi",60000f);
        e.display();
    }
}