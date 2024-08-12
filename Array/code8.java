// 2. Write a program for java array to find missing element in the array.
// [11, 12, 13, 15, 16,17]
class code8 
{
    public static void main(String[] args)
     {
        int arr[]={11,12,13,15,16,17};
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i+1]-arr[i]!=1)
            {
                System.out.print(arr[i]+1);
                break;
            }
        }
        
    }
    
    
    
}
