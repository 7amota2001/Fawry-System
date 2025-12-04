public class OverallDiscount extends DiscountDecorator {
    User user = new User();
    public void makeDiscount(double amount,String email){
        amount=amount-(amount * 0.1);
        user.Update(email,-amount);
    }
}
