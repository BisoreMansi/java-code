
// Q.6 Sort the array of 0s , 1s and 2s.
//Optimal Solution
//Dutch National Flag 
class code23 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 0, 2, 0 };
        int low = 0;
        int mid = 0;
        int high = arr.length - 1, t, m;

        while (mid <= high) {
            if (arr[mid] == 0) {
                t = arr[mid];
                arr[mid] = arr[low];
                arr[low] = t;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                m = arr[mid];
                arr[mid] = arr[high];
                arr[high] = m;
                high--;
            }

        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

}
