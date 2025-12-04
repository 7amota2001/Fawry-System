public class Client {
    private ServiceFactory factory;
    private final MobileService mobileRecharge;
    private final InternetService internetCharge;

    public Client(ServiceFactory factory){

        mobileRecharge = factory.CreateMobileRecharge();
        internetCharge = factory.CreateInternetRecharge();

    }


    public void ChargeForMobile(){

        mobileRecharge.ChargeMobile();

    }

    public void ChargeForInternet(){

        internetCharge.ChargeInternet();

    }

}
