//  MultiDimensional Array
class MultiDimensional {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        // Initilize the value
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }

        }
        // printing the value
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Enhance for loop
        for (int n[] : arr) {
            for (int m : n) {
                System.out.print(m + " ");

            }
            System.out.println(" ");

        }

    }

}
