

 class Vss {
    
    int num = 1;

    public void check() {
        do {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num + " is divisible by both 3 and 5");
            } else if (num % 3 == 0) {
                System.out.println(num + " is divisible by 3");
            } else if (num % 5 == 0) {
                System.out.println(num + " is divisible by 5");
            }
            num++;
        } while (num < 100);
    }

    public static void main(String[] args) {
        Vss obj = new Vss();
        obj.check();
    }
}
