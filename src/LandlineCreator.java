public abstract class LandlineCreator implements Identifier{
    protected abstract Receipt CreateReceipt(String type);

    public Receipt payReceipt(String type, String email){
        PaymentMethod pa = new PaymentMethod();
        pa.P(email);


        return CreateReceipt(type);
    }
}
