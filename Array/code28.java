
// Q.10.
// Write a program to cyclically rotate array by one.

public class code28 {
    public static void main(String[] args) {
        int arr[] = { 7, 9, 8, 6, 1, 2 };
        int las_ele = arr[5];
        for (int i = arr.length - 1; 0 < i; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = las_ele;
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }

    }

}
