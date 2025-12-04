import java.util.Scanner;

public class PaymentMethod {
    static Transaction t = new Transaction();
    static public void P(String s){

        Scanner scan = new Scanner(System.in);
        System.out.print("enter the amount of money you want to recharge : ");
        int charge = scan.nextInt();
        t.setEmail(s);
        t.setCost(charge);
        t.addt(t);
        scan.nextLine();

        System.out.print("Choose payment method (visa, wallet): ");
        String paymentMethod = scan.nextLine();

        if (paymentMethod.equalsIgnoreCase("wallet")){
            PaymentStrategy paymentStrategy = new PayByWallet();
            paymentStrategy.pay(charge,s);
        }

        else if (paymentMethod.equalsIgnoreCase("visa")){
            PaymentStrategy paymentStrategy = new PayByVisa();
            paymentStrategy.pay(charge,s);
        }
    }
}
