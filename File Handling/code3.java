//Reading File by FileInputstream

import java.io.FileInputStream;

class Code3
{
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("data.txt");
            int i=0;
            while (i!=-1) {
                 i= fin.read();
                System.out.print((char)i);

                
            }
           fin.close();
                
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
      

    }
}