public class SpecificDiscount extends  DiscountDecorator {

    User user = new User();
    public void makeDiscount(double amount,String email){
        amount=amount-(amount * 0.2);
        user.Update(email,-amount);
    }
}
