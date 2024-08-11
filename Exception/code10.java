import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ReadAndWrite {
    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d:/abc.txt");
    }

}