import java.io.*;
import java.util.ArrayList;

public class User {
    private String UserName;

    private String Email;

    private String Pass;

    private double Wallet;

    FilePath f = new FilePath();

    public User(){
        UserName = "";
        Email = "";
        Pass = "";
        Wallet = 0;
    }

    public User(String userName, String email, String pass, double wallet) {
        UserName = userName;
        Email = email;
        Pass = pass;
        Wallet = wallet;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public void setWallet(double wallet) {
        Wallet = wallet;
    }

    public String getUserName() {
        return UserName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPass() {
        return Pass;
    }

    public double getWallet() {

        return Wallet;
    }

    public void Add(User u) {
        try (FileWriter writer = new FileWriter(f.getUserPath(), true)) {
            writer.append(u.Email).append("\n");
            writer.append(u.UserName).append("\n");
            writer.append(u.Pass).append("\n");
            writer.append(Double.toString(u.Wallet)).append('\n');

        }catch (Exception e) { System.out.println("Error");}


    }

    public void Update(String name, double amount){
        ArrayList<User> users = new ArrayList<>();


        try{
            BufferedReader bf = new BufferedReader(new FileReader(f.getUserPath()));
            String s = bf.readLine();

            while(s != null){
                String u;
                String e;
                String p;
                double w;

                e = s;
                setEmail(e);
                s = bf.readLine();



                u = s;
                setUserName(u);

                s = bf.readLine();



                p = s;
                setPass(p);

                s = bf.readLine();

                w = Double.parseDouble(s);
                setWallet(w);
                s = bf.readLine();

                User user = new User(u, e, p, w);
                users.add(user);

            }

            for (User user : users) {
                if (user.getEmail().equals(name))
                    user.setWallet(amount + user.getWallet());
            }

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        try {
            PrintWriter writer= new PrintWriter(f.getUserPath());
            writer.print("");
            writer.close();



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (User user : users) {
            Add(user);
        }
    }

}