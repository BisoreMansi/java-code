//Q.3 Write a program to reverse the array.
class Code20 
 {
    public static void main(String[] args) 
    {
        int arr[]= {5,4,3,2,1};
        int start = 0;
        int end = arr.length-1,temp=0;
        while(start<end)
        {
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        for(int k : arr)
        {
            System.out.print(k +" ");
        }
        
    }
    
}
