// Q.6 Sort the array of 0s , 1s and 2s.
// Best Solution
public class code24 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;

            } else {
                count2++;
            }

        }
        for(int j=0; j<count0; j++)
        {
            arr[j]=0;
            System.out.print(arr[j]);
        }
        for(int j=0; j<count1; j++)
        {
            arr[j]=1;
            System.out.print(arr[j]);
        }
        for(int j=0; j<count2; j++)
        {
            arr[j]=2;
            System.out.print(arr[j]);
        }

    }

}
