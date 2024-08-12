//Selection Sort Algorithm
class Sort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 8, 3 };
        for (int i = 0; i < arr.length; i++) {
            int index = i, temp = 0;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] < arr[index]) {
                    index = j; // 14583
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            System.out.print(arr[i]);

        }

    }
}
