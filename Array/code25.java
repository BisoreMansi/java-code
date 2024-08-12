
// Q.7 Sub array with given sum
// Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

// Example 1:
// Input:
// N = 5, S = 12
// A[] = {1,2,3,7,5}
// Output: 2 4
// Explanation: The sum of elements 
// from 2nd position to 4th position 
// is 12.

// Example 2:
// Input:
// N = 10, S = 15
// A[] = {1,2,3,4,5,6,7,8,9,10}
// Output: 1 5
// Explanation: The sum of elements 
// from 1st position to 5th position
// is 15.
// 1 <= N <= 105
// 1 <= Ai <= 109

class code25 {
    public static void main(String args[]) {
        int A[] = { 1, 2, 3, 7, 5 };
        int sum = 12, t=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    t = A[j];
                    A[j] = A[i];
                    A[i] = t;

                }

            }
        }
       
        for(int k = 0; k<=A.length; k++ )
        {
            for(int l=k+1; l<A.length; l++)
            {
                if(sum ==(A[k]+A[l]))
                {
                    System.out.println(k+" "+ l);

                }
            }
        }

    }

}
