import java.util.Scanner;

public class App {
    public static void main(String[] arg) {
        Account account = new Account(new Money(10, 20));

        String menu = "1 - get balance" +
                "\n2 - deposit money" +
                "\n3 - withdraw money" +
                "\n4 - menu" +
                "\n5 - exit";

        System.out.println(menu);

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while(choice != 5) {
            int unit;
            int fractions;
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(account.getBalance());
                    break;

                case 2:
                    System.out.println("Enter unit");
                    unit = scanner.nextInt();
                    System.out.println("Enter fractions");
                    fractions = scanner.nextInt();
                    account.deposit(new Money(unit, fractions));
                    break;

                case 3:
                    System.out.println("Enter unit");
                    unit = scanner.nextInt();
                    System.out.println("Enter fractions");
                    fractions = scanner.nextInt();
                    account.withdraw(new Money(unit, fractions));
                    break;

                case 4:
                    System.out.println(menu);
                    break;

                case 5:
                    System.out.println("Bye");
                    scanner.close();
                    break;

                default:
                    System.out.println("There is no such option");
            }
        }
    }
}
