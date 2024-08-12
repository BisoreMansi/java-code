//Bubble Sorting
class Bubblesort {
    public static void main(String[] args) {
        int arr[] = { 7, 4, 8, 1, 5 };
        int temp = 0;
        int sorting = 0;
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    sorting ++;

                }

            }
            if (sorting == 0) {
                break;
            }

        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "");
        }

    }

}
