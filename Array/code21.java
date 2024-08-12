
//Q.4 Write a program to sort the array
class code21 {
    public static void main(String[] args) {
        int arr[] = { 6, 9, 5, 1, 0, 22, 91 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }
        for(int k : arr)
        {
            System.out.print(k+" ");
        }

    }

}
