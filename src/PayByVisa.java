import java.util.Scanner;

public class PayByVisa implements PaymentStrategy{
    @Override
    public void pay(double amount, String email) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your visa number: ");

        String num = scan.nextLine();

        System.out.println("Transaction completed");
        System.out.println("Amount of " + amount + " is deducted from your card");
    }
}
