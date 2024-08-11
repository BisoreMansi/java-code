//Comparator

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person
{
    private String name;
    private int age;
   public Person(int age, String name)
    {
        this.age = age;
        this.name = name;

    }
    public String getName() {
        return name;
    }

    public int getAge()
    {
        return age;
    }
    public String toString()
    {
        return name + "(" +age +")";
    }


}
 class AgeComparator implements Comparator<Person> {
   public int compare(Person p1, Person p2)
   {
    return Integer.compare(p1.getAge(), p2.getAge());
    }
     
}
class NameComparator implements Comparator<Person>
{
    public int compare(Person p1, Person p2)
    {
        return p1.getName().compareTo(p2.getName());
    }
}
class ComparatorExample
{
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(30, "Alice"));
        people.add(new Person(25, "Bob"));
        people.add(new Person(35, "Charlie"));

        

    }
}