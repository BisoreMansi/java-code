//Q.2 Find minimum and maximum element in array


class code19 {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 8, 1, };
        int t1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { 
                    t1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t1;

                }
            }
        }
        System.out.println("Min ="+ arr[0]+" Max"+ arr[arr.length-1]);
        

    } 

}
