import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoginController {
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Admin> admins = new ArrayList<>();
    
    
    
    public boolean SignIn(String email, String password){
        User user = new User();
        FilePath f = new FilePath();
        boolean flag = false;


        try {
            BufferedReader bf = new BufferedReader(new FileReader(f.getUserPath()));
            String s = bf.readLine();

            while (s != null) {
                String u;
                String e;
                String p;
                double w;

                e = s;
                user.setEmail(e);
                s = bf.readLine();


                u = s;
                user.setUserName(u);

                s = bf.readLine();


                p = s;
                user.setPass(p);

                s = bf.readLine();

                w = Double.parseDouble(s);
                user.setWallet(w);
                s = bf.readLine();

                User user1 = new User(u, e, p, w);
                users.add(user1);

            }
            int c = 0;

            for (User user1 : users) {
                if (user1.getEmail().equals(email) && user1.getPass().equals(password)) {
                    System.out.print("Welcome" + " " + user1.getUserName());
                    flag = true;
                    break;
                }
                c++;
            }
            if (c == users.size())
                System.out.println("The email or password invalid");


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return flag;
    }
    
    
    public boolean SignInAdmin(String email, String password) {
    	Admin admin = new Admin();
    	FilePath a = new FilePath();
    	boolean flag = false;
    	
    	try {
            BufferedReader bf = new BufferedReader(new FileReader(a.getAdminPath()));
            String s = bf.readLine();

            while (s != null) {
                String u;
                String e;
                String p;

                e = s;
                admin.setEmail(e);
                s = bf.readLine();

                u = s;
                admin.setUserName(u);
                s = bf.readLine();


                p = s;
                admin.setPassword(p);
                s = bf.readLine();

                Admin ad = new Admin(e, u, p);
                admins.add(ad);

            }
            int c = 0;

            for (Admin admin1 : admins) {
                if (admin1.getEmail().equals(email) && admin1.getPassword().equals(password)) {
                    System.out.println("Welcome" + " " + admin1.getUserName());
                    flag = true;
                    break;
                }
                c++;
            }
            if (c == admins.size())
                System.out.println("The email or password invalid");


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return flag;
    }

    
    
    public void SignUp(String email, String username, String password) {
    	
        User u = new User(username, email, password, 0);

        u.Add(u);
    }
}
