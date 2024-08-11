//Writing File Using FileOutputStream

import java.io.FileOutputStream;

class Code2
{
    public static void main(String[] args) 
    {
        try {
            FileOutputStream fout = new FileOutputStream("data.txt",true);
            String s = "Writing in file";
            byte b[] = s.getBytes();//String into byte
            fout.write(b);
            System.out.println("Writing done");
            fout.close();
        } catch (Exception e) 
        {
            System.out.println(e);
            
        }
     
      
        
    }
}