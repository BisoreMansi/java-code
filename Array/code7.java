// 1.create an integer array with values- 22, 32, 45, 22, 56, 22, 78.
//  Find out the value that have occurred maximum number of times and also show number of count. Example 22 is most occurred value with a count of 3.
class code7 {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 2, 5, 2 };
        int arrLength = arr.length;
        int count = 0, num = 0;
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arrLength; j++) {
                if (arr[i] == arr[j]) {
                    if (i != j) {
                        count++;
                        num = arr[i];
                    }
                }
            }
            if (count > 0) {
                count++;
                break;
            }
        }
        System.out.println("Number =" + num + "repeat " + count + "times.");

    }

}
