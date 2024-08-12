
// Q.5 Find the kth largest and kth smallest element in array.
// Q.5 Find occurance of an integer number in array.
class Code22 {
    public static void main(String[] args) {
        int arr[] = {  3, 22, 5, 22, 4, 22 };
        int count = 1;
        int end = arr.length - 1;

        for (int i = 0; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                }

            }
            if(count>1){
                System.out.println("number ="+ arr[i]+ "Occurance ="+ count);
            break;
            }
         
        }

    }

}
