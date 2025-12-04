public abstract class DonationCreator implements Identifier{
    protected abstract Donation CreateDonation(String type);

    public Donation PayDonation(String type, String email){
        PaymentMethod pa = new PaymentMethod();
        pa.P(email);

        return CreateDonation(type);
    }
}
