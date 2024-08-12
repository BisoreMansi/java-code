// 3.write a program to print alternate elements in an array.
// [11, 12, 13, 15, 16, 18] - 
// Output should be- 11, 13, 16
class code9
{
    public static void main(String[] args)
    {
        int arr[]={ 11,12,13,15,16,18};
        for(int i=0; i<arr.length; i= i+2)
        {
            System.out.println(arr[i]);
        }
        
    }
}