import java.util.ArrayList;
import java.util.Scanner;

public class SystemForm {
    static Transaction t = new Transaction();
    public void Form(String email){
        User user = new User();
        GlobalVariable g = new GlobalVariable();
        Admin admin = new Admin();
        System.out.println();

        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("**** System menu ****");

        System.out.println();

        do{
            System.out.println("1. Mobile charge \n" +
                    "2. Internet charge \n" +
                    "3. Landline receipt \n" +
                    "4. Donation service \n" +
                    "5. Add credit to your wallet \n" +
                    "6. Return to login menu \n");
            if(admin.isDiscount())
                System.out.println("discount");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    Client f = ServiceCreator(email);
                    f.ChargeForMobile();
                    break;
                case 2:
                    Client F = ServiceCreator(email);
                    F.ChargeForInternet();
                    break;

                case 3:
                    System.out.print("Pay monthly receipt or quarter receipt: ");
                    scan.nextLine();
                    String s = scan.nextLine();
                    LandlineCreator l = new LandlineService();
                    l.payReceipt(s, email);
                    break;
                case 4:
                    System.out.print("Choose foundation to donate(hospital, school, NOG): " );
                    scan.nextLine();
                    String D = scan.nextLine();
                    DonationCreator d = new DonationService();
                    d.PayDonation(D, email);
                    break;
                case 5:
                    System.out.print("Enter the amount you want to add: ");
                    int amount = scan.nextInt();
                    user.Update(email, amount);
                    System.out.println("You added " + amount);
                    break;
                default:
                    t.Print();
                    System.out.println("Wrong choice.");
            }

        }while (choice != 6);
    }



    private static Client ServiceCreator(String e) {
        Client c;
        ServiceFactory service = null;
        System.out.print("Choose service provider: ");
        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            String s = scan.nextLine();
            if (s.equals("orange")) {
                service = new OrangeFactory();
                PaymentMethode(e);
                flag = false;
            } else if (s.equals("vodafone")) {
                service = new VodafoneFactory();
                PaymentMethode(e);
                flag = false;
            } else if (s.equals("we")) {
                service = new WeFactory();
                PaymentMethode(e);
                flag = false;
            } else if (s.equals("etisalat")) {
                service = new EtisalatFactory();
                PaymentMethode(e);
                flag = false;
            } else{
                System.out.println("Service " + s + " not supported please try again");
                System.out.print("Choose service provider: ");
            }
        }

        c = new Client(service);
        return c;
    }

    public static void PaymentMethode(String e){
        Scanner scan = new Scanner(System.in);
        Transaction transaction = new Transaction();
        System.out.print("enter the amount of money you want to recharge : ");
        int charge = scan.nextInt();

        transaction.setCost(charge);
        transaction.setEmail(e);
        t.addt(transaction);
        scan.nextLine();

        System.out.print("Choose payment method (visa, wallet): ");
        String paymentMethod = scan.nextLine();

        if (paymentMethod.equalsIgnoreCase("wallet")){
            PaymentStrategy paymentStrategy = new PayByWallet();
            paymentStrategy.pay(charge,e);
        }

        else if (paymentMethod.equalsIgnoreCase("visa")){
            PaymentStrategy paymentStrategy = new PayByVisa();
            paymentStrategy.pay(charge,e);
        }
    }
}

