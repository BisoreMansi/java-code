 class test9 {
    public static void main(String[] args) {
        ReadAndWrite r = new ReadAndWrite();

        try {
            r.readFile();
        } catch (Exception e) {

            System.out.println(e);
        }

    }

}