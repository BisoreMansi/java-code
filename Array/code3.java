public class code3 
{
    public static void main(String[] args) 
    {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int arr1[]= new int[10];
        int x=0;
        for(int i=0; i<arr.length; i++)
        {
            arr1[x]=arr[i];
            x++;
            System.out.println(arr1[i]);
        }

        
    }
    
}
