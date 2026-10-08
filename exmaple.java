import java.util.Scanner;

class example {

    public static void main(String[] args) {
        int num = 0;

        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.err.println("Even");
        }

        System.err.println("Y or N");

        while (true) {
            String s = sc.nextLine();
            boolean c = s.contains("Y");
            if (c == true) {
                System.err.println("Enter a number ");
                num = sc.nextInt();
                if (num % 2 == 0) {
                    System.err.println("Even");
                }
                System.err.println("Y or N");
                s = sc.nextLine();
            }
            else {
                c = s.contains("N");
                if (c) {
                    break;
                }
            }

        };

    }
}