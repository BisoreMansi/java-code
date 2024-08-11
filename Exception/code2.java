import java.io.FileInputStream;

public class code2 {
    public static void main(String[] args) {
        // try {
        // FileInputStream fis = new FileInputStream("d:/aaa.txt");
        // } catch (Exception e) {
        // // TODO: handle exception
        // System.out.println(e);
        // }


        int arr[] = { 10, 20, 30 };
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
           
            e.printStackTrace();
        }

    }

}
