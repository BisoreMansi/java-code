// Q.9 Find the Union and Intersaction of two sorted array.
// Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays. 
// Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
// Example 1:
// Input:
// 5 3
// 1 2 3 4 5
// 1 2 3
// Output: 
// 5
// Explanation: 
// 1, 2, 3, 4 and 5 are the
// elements which comes in the union set
// of both arrays. So count is 5.
// Example 2:
// Input:
// 6 2 
// 85 25 1 32 54 6
// 85 2 
// Output: 
// 7
// Explanation: 
// 85, 25, 1, 32, 54, 6, and
// 2 are the elements which comes in the
// union set of both arrays. So count is 7.

public class code27 
{
    public static void main(String[] args) 
    {
        int arr1[] = {11,3,5,6,9};
        int arr2[] = {11,22,33};
       int  count = arr1.length+arr2.length;

        // if(arr1.length>arr2.length)
        // {
            
            for(int i=0; i<arr1.length; i++)
            {
                for(int j=0; j<arr2.length ; j++)
            {
                if(arr1[i]==arr2[j])
                {
                    count--;
                }
            }

            }
            System.out.println(count);
        // }
       
       

        

        
    }
    
}
