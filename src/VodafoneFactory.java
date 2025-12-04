public class VodafoneFactory implements ServiceFactory{

    @Override
    public MobileService CreateMobileRecharge() {
        return  new VodafoneMobile();
    }

    @Override
    public InternetService CreateInternetRecharge() {
        return new VodafoneInternet();
    }
}
