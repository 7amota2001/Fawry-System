public class EtisalatFactory implements ServiceFactory{
    @Override
    public MobileService CreateMobileRecharge() {
        return new EtisalatMobile();
    }

    @Override
    public InternetService CreateInternetRecharge() {
        return new EtisalatInternet();
    }
}
