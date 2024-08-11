import java.util.Scanner;

class Voting {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int a = s.nextInt();

        if (a < 18) {
            throw new YoungerAgeException("You are not eligible");
        } else {
            System.out.println("You are Eligible");
        }

    }
}