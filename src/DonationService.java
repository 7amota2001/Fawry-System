public class DonationService extends DonationCreator{

    @Override
    protected Donation CreateDonation(String type) {
        Donation d = null;

        if(type.equals("school")) {
            d = new School();
            d.Donate();
        }
        if(type.equals("NOG")) {
            d = new NOG();
            d.Donate();
        }
        if(type.equals("hospital")) {
            d = new CancerHospital();
            d.Donate();
        }
        return d;
    }
}
