import java.util.Scanner;

public class AdminForm {

    public void adminForm(){
        Admin admin = new Admin();
        GlobalVariable variable = new GlobalVariable();
        Scanner scan = new Scanner(System.in);

        System.out.println("***** Admin menu *****");

        System.out.println("1. Set discount");

        int choice = scan.nextInt();
        scan.nextLine();

        if(choice == 1){
            System.out.print("Enter discount amount: ");
            double d = scan.nextDouble();
            scan.nextLine();

            admin.setDiscount(true);

        }
    }
}
