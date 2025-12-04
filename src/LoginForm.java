import java.util.Scanner;

public class LoginForm {

    public void Form(){
        SystemForm system = new SystemForm();
        AdminForm admin = new AdminForm();
        Scanner scan = new Scanner(System.in);
        LoginController l = new LoginController();
        int choice;

        System.out.println("****** welcome to Fawry system ******");
        do {
            System.out.print("1. Sign in as user \n" +
                    "2. Sign in as admin \n" +
                    "3. Sign up \n" +
                    "4. Exit \n");

            choice = scan.nextInt();
            scan.nextLine();


            System.out.print("");
            switch (choice) {
                case 1:
                    System.out.print("Enter your email: ");
                    String em = scan.nextLine();

                    System.out.print("Enter your password: ");
                    String pas = scan.nextLine();

                    if(l.SignIn(em, pas)){
                    	system.Form(em);
                    }
                    break;

                case 2:
                	
                	System.out.print("Enter your email: ");
                    String e = scan.nextLine();

                    System.out.print("Enter your password: ");
                    String password = scan.nextLine();

                    if(l.SignInAdmin(e, password))
                        admin.adminForm();
                    break;
                case 3:
                    System.out.print("Enter your E-mail: ");
                    String email = scan.nextLine();

                    System.out.print("Enter your username: ");
                    String username = scan.nextLine();

                    System.out.print("Enter your password: ");
                    String pass = scan.nextLine();


                    l.SignUp(email, username, pass);
                    System.out.println("You signed up successfully");
                    break;
                case 4:
                    System.out.println("Thank you! :D");
                    break;

                default:
                    System.out.println("Invalid input");

            }
            System.out.println();
        }while (choice < 4);
    }
}
