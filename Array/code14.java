 class code14 
{
    public static void main(String[] args) 
    {
        int arr[][]= new int[3][3];
        int count =0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                arr[i][j]= count++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        
        
    }
    
}
