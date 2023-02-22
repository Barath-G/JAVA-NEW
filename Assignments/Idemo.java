import java.util.Scanner;

public class Idemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");

        String name = scanner.nextLine();

        System.out.println("What is your rating from 1 to 5");

        scanner.nextShort();
        scanner.nextLine();
        System.out.println("Enter email");

        String email = scanner.nextLine();

        int rating = Integer.parseInt(scanner.nextLine());

        System.out.println("Hello " + name);
        System.out.println("You rated us '" + rating);
        System.out.println("Email is " + email);

    }
}