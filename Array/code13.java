//Jagged Array
class code13 {
    public static void main(String[] args) {
        // int arr[][]={{1,2,3},{4,5},{7,8,9,7}};
        // for(int i=0; i<arr.length; i++)
        // {
        // for(int j=0; j<arr[i].length; j++)
        // {
        // System.out.print(arr[i][j]+" ");
        // }
        // System.out.println();
        // }

        int arr[][] = new int[5][];
        arr[0] = new int[3];
        arr[1] = new int[7];
        arr[2] = new int[8];
        arr[3] = new int[2];
        arr[4] = new int[3];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }

        }
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }

    }

}
