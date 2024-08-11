// Object Cloning 
class Human implements Cloneable
{
    int age;
    String name;

    Human(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    Human(Human other)
    {
        this.age = other.age;
        this.name = other.name;

    }
    
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class Driver
{
    public static void main(String[] args)  {
        Human mansi = new Human(12,"mansi");
        // Human twin = new Human(mansi);
        try {
            Human twin = (Human) mansi.clone();
            System.out.println(twin.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
     


    }
}