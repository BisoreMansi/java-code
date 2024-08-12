//Anonymous Array
class TestAnonmousArray 
{
    static void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) 
    {
        printArray(new int[]{2,3,5,6});
        
    }
    
}
