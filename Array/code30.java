

class SpiralMAtrix
{
    public static void main(String[] args) {
        int mat[][] = {{1,2,3,4},{8,7,6,5},{12,11,10,9},{16,15,14,13}};
        int n = mat.length;
        int m = mat[0].length;
        int top = 0, left = 0, right = m-1, bottom = n-1;
        while (top<=bottom && left<=right) {
            
        
        for(int i=top; i<=right; i++)
        {
            System.out.print(mat[top][i]+" ");
        }
        top++;
        for(int i=top; i<=bottom; i++)
        {
            System.out.print(mat[i][right]+" ");
        }
        right--;
        if(top<=bottom){
        for(int i=right; i>=left; i--)
        {
            System.out.print(mat[bottom][i]+" ");
        }
        bottom--;}
        if (left<=right) {
            
        
        for(int i=bottom; i>=top; i--)
        {
            System.out.print(mat[i][left]+" ");
        }
        left++;}

    }
}
}