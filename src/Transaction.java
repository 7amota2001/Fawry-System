
import java.util.ArrayList;

public class Transaction {
    private int cost;
    private String Email;

    ArrayList<Transaction> transactions = new ArrayList<>();


    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getCost() {
        return cost;
    }

    public String getEmail() {
        return Email;
    }

    public void addt(Transaction t){
        transactions.add(t);
    }

    public void Print(){
        for(int i = 0 ; i < transactions.size(); i++){
            System.out.print(transactions.get(i).getCost() + " " + transactions.get(i).getEmail());
        }
    }
}
