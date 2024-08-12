//reverse array
// class code6 {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5 };
//         for (int i = arr.length - 1; i >= 0; i--) {
//             System.out.println(arr[i] + ",");
//         }

//     }

// }

// duplicate values
// class code {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 1, 3 };
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     System.out.println("duplicate" + arr[i]);
//                 }
//             }

//         }

//     }

// }
// remove duplicate value
// class pro4 {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 1, 4, 5 };
//         int l = arr.length;
//         for (int i = 0; i < l; i++) {
//             for (int j = i + 1; j < l; j++) {
//                 if (arr[i] == arr[j]) {

//                     for (int k = j; j < l - 1; j++) {
//                         arr[k] = arr[k + 1];
//                     }
//                 }

//             }
//         }

//         for (int i = 0; i < l - 1; i++) {
//             System.out.print(arr[i] + " ");
//         }

//     }

// }
