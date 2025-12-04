public class WeFactory implements ServiceFactory{
    @Override
    public MobileService CreateMobileRecharge() {
        return new WeMobile();
    }

    @Override
    public InternetService CreateInternetRecharge() {
        return new WeInternet();
    }
}
