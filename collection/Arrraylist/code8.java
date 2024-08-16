import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student
{
    private int sno;
      String sname;
   private int marks1,marks2,marks3,total;
     private float avg;
    Student(int sno , String sname, int marks1, int marks2, int marks3)
    {
        this.sno = sno;
        this.sname = sname;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;

    }
    public int caltotal()
    {
        total = marks1 + marks2 + marks3;
        return total;
    }
     public float calavg()
     {
        avg = total/3.0f;
        return avg;
     }
     public String toString()
     {
        return sno + sname + total + avg + marks1 + marks2 + marks3 ;
     }
}
class Driver
{
    public static void main(String[] args) {
        List <Student> al = new ArrayList<>();
        al.add(new Student(0, "mansi", 30, 90, 78));
        al.add(new Student(1, "harsh", 70, 90, 70));
        al.add(new Student(2, "babita", 100, 45, 12));

        
        System.out.println("Name Starts with H");
        for(Student s : al)
        {
            if(s.sname.startsWith("h"))
            {
                s.calavg();
                s.caltotal();
                System.out.println("NAme start with H"+s);
            }
        }
    System.out.println("Total Marks :");
    for(Student s : al)
    {
        System.out.println("NAme ="+ s.sname + " "+"Total ="+ s.caltotal());
    }
    System.out.println("Average ");
    for(Student s : al)
    {
        System.out.println( "NAMe = "+s.sname + "" + "Average ="+s.calavg());
    }

    System.out.println("Remove B ");
    // for(Student s : al)
    // {
    //     System.out.println(s.sname.startsWith("b"));
    // }

    System.out.println("Iterator");
    Iterator<Student> i = al.iterator();
    while (i.hasNext()) {
        Student sh = i.next();
        if(sh.sname.startsWith("b"))
        {
            i.remove();
        }

        
    }
    for(Student sd : al)
    {
        sd.caltotal();
        sd.calavg();
        System.out.println(sd +" ");
    }

    }
}