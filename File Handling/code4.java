import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
    String name;
    int rno;
    Student(String name , int rno)
    {
        super();
        this.name = name;
        this.rno= rno;
    }
}
class Classroom
{
     public static void main(String[]  args) 
    {
        try {
            Student s = new Student("mansi", 201013);
            //can i write this object in file
            //Serialization of the object 
            File f = new File("data.txt");
            FileOutputStream fo = new FileOutputStream(f);
            ObjectOutputStream objo = new ObjectOutputStream(fo);
            objo.writeObject(s);
            System.out.println(" Object write succesfull");

            objo.close();
           
            //i have written the object .I have Serialized the Object
            // deserialize the object = read object from the file
            FileInputStream fi = new FileInputStream(f);
            ObjectInputStream oi = new ObjectInputStream(fi);
            Student s1 = null;
            s1 = (Student)oi.readObject();
            System.out.println(s1.name +" "+ s1.rno);
          
            oi.close();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
      
        
        
    }
}

