import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Code4
{
    public static void main(String[] args) {
        try {
            Student s = new Student(null, null, null)
            File f = new File("data1.txt");
            FileOutputStream fo = new FileOutputStream(f);
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(s);
        } catch (Exception e) {
            // TODO: handle exception
        }
      
    }
}

