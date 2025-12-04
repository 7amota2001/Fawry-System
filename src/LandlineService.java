public class LandlineService extends LandlineCreator{

    @Override
    public Receipt CreateReceipt(String type) {

        Receipt r = null;
        if(type.equals("monthly")) {
            r = new MonthlyReceipt();
            r.Pay();
        }
        if(type.equals("quarter")) {
            r = new QuarterReceipt();
            r.Pay();
        }
        return r;
    }
}
