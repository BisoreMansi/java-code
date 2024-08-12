//sum of array elements
// class code5 {
//     public static void main(String[] args) {
//         int sum = 0;
//         int array[] = { 2, 3, 2, 3, 2, 3 };
//         for (int i = 0; i < array.length; i++) {

//             sum += array[i];
//         }
//         System.out.println(sum);
//     }

// }
// find minimum and maximum element in array
class code5 {
    public static void main(String[] args) {

        int array[] = { 21, 31, 27, 39, 2, 3 };
        int max = 0, min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("Maximum =" + max);
        System.out.println("Minimum =" + min);

    }

}