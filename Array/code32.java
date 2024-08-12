//Given a 2D square matrix, print the Principal and Secondary diagonals. 
// Input: 
// 4
// 1 2 3 4
// 4 3 2 1
// 7 8 9 6
// 6 5 4 3
// Output:
// Principal Diagonal: 1, 3, 9, 3
// Secondary Diagonal: 4, 2, 8, 6
 class DigonalPrint
 {
    public static void main(String args[])
    {
        int arr[][] = {{1,2,3,4},{4,3,2,1},{7,8,9,6},{6,5,4,3}};
        System.out.println(arr.length);
       //Print Principal Diagonal
       for(int i=0; i<arr.length; i++)
       {
        for(int j=i; j<=i;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
       }
       
    }
    
}
