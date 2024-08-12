//print Largest Number
class LargestNum
{
    public static void main(String[] args) {
        int arr[]={2,17,9,5,6,22};
       
        for(int i=0; i<arr.length; i++)
        {
            int max =0;
            for(int j=i; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    if(max <arr[j])
                    {
                        max = arr[j];
                    }
                
                }
            }
            System.out.println(arr[i]+" = greater number"+ max);
        }
    }
}