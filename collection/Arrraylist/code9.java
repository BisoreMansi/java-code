import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    private int sno;
    String sname;
    private int marks1, marks2, marks3, total;
    private float avg;

    Student(int sno, String sname, int marks1, int marks2, int marks3) {
        this.sno = sno;
        this.sname = sname;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int caltotal() {
        total = marks1 + marks2 + marks3;
        return total;
    }

    public float calavg() {
        avg = total / 3.0f;
        return avg;
    }

    @Override
    public String toString() {
        return sno + " " + sname + " " + total + " " + avg;
    }
}

class Driver {
    public static void main(String[] args) {
        List<Student> al = new ArrayList<>();
        al.add(new Student(0, "Mansi", 30, 90, 78));
        al.add(new Student(1, "Harsh", 70, 90, 70));
        al.add(new Student(2, "Babita", 100, 45, 12));

        // Print students whose name starts with "H"
        System.out.println("Name Starts with 'H':");
        for (Student s : al) {
            if (s.sname.startsWith("H")) {
                s.caltotal();  // Calculate total
                s.calavg();    // Calculate average
                System.out.println(s);
            }
        }

        // Print total marks of each student
        System.out.println("\nTotal Marks:");
        for (Student s : al) {
            System.out.println(s.sname + ": " + s.caltotal());
        }

        // Print average marks of each student
        System.out.println("\nAverage:");
        for (Student s : al) {
            System.out.println(s.sname + ": " + s.calavg());
        }

        // Remove students whose name starts with "B"
        System.out.println("\nRemoving students whose name starts with 'B'...");
        Iterator<Student> i = al.iterator();
        while (i.hasNext()) {
            Student sh = i.next();
            if (sh.sname.startsWith("B")) {
                i.remove();
            }
        }

        // Print remaining students
        System.out.println("\nRemaining students:");
        for (Student sd : al) {
            sd.caltotal();  // Ensure total is calculated
            sd.calavg();    // Ensure average is calculated
            System.out.println(sd);
        }
    }
}
