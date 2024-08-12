// class pro4
// {
//     public static void main(String[] args) 
//     {
//         int arr[]= {12,34,56,78,67};
//          float sum =0,a=arr.length;
//         for(int i=0; i<a; i++)
//         {
//             sum+=arr[i];
//         }
//         System.out.println("Average of array element"+sum/a);

//     }
// }

// class pro5 {
//     public static void main(String[] args) {
//         int arr[] = { 12, 34, 56, 78, 67 };
//         int element = 78;
//         for (int i = 0; i < arr.length; i++) {
//             if (element == arr[i]) {
//                 for (int j = i; j < arr.length; j++) {
//                     arr[j] = arr[j + 1];

//                     break;
//                 }
//             }
//         }
//         for (int i = 0; i < arr.length - 1; i++) {
//             System.out.println(arr[i] + " ");
//         }

//     }
// }