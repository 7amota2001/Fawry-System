import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PayByWallet implements PaymentStrategy{
    @Override
    public void pay(double amount, String email) {

        User user = new User();
        if(check(email, amount)) {
            DiscountDecorator d = new OverallDiscount();
            //d.makeDiscount(amount, email);
            user.Update(email, -amount);
            System.out.println("Transaction completed");
        }
        else System.out.println("Not enough credit");
    }

    private static boolean check(String email, double a){
        User user = new User();
        FilePath f = new FilePath();
        ArrayList<User> users = new ArrayList<>();
        boolean flag = false;
        try{
            BufferedReader bf = new BufferedReader(new FileReader(f.getUserPath()));
            String lineReader = bf.readLine();

            while(lineReader != null){
                String u;
                String e;
                String p;
                double w;
                e = lineReader;
                user.setEmail(e);
                lineReader = bf.readLine();
                u = lineReader;
                user.setUserName(u);
                lineReader = bf.readLine();
                p = lineReader;
                user.setPass(p);
                lineReader = bf.readLine();
                w = Double.parseDouble(lineReader);
                user.setWallet(w);
                lineReader = bf.readLine();
                User user1 = new User(u, e, p, w);
                users.add(user1);
            }
            for (User user1 : users) {
                if (user1.getEmail().equals(email)) {
                    if(user1.getWallet() >= a)
                        flag = true;
                    break;
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return flag;
    }
}
