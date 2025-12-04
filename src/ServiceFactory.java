public interface ServiceFactory extends Identifier {
    public MobileService CreateMobileRecharge();
    public InternetService CreateInternetRecharge();
}
