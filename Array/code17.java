//Returning Array from the Method
class code17 
{
    static int[] get()
    {
        return  new int[] {2,5,63,2};
    }
    public static void main(String[] args)
     {
        int a[]= get();
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
    
}
