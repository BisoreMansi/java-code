// File Class

import java.io.File;

class code1
{
    public static void main(String args[])
    {
        File f = new File("data.txt");
        System.out.println(f.canRead());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.length());
    }
}