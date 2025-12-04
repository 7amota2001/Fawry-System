public class OrangeFactory implements ServiceFactory {
    MobileService product;
    @Override
    public MobileService CreateMobileRecharge() {
        return new OrangeMobile();
    }

    @Override
    public InternetService CreateInternetRecharge() {
        return new OrangeInternet();
    }
}
