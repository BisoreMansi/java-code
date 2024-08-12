//Insertion Sort
class Instertionsort {
    public static void main(String[] args) {
        int arr[] = { 8, 3, 1, 9, 2, 5 };
        for (int i = 1; i < arr.length; i++) {
            int t = 0;
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;

                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}
