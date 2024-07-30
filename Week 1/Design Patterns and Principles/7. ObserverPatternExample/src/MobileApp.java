public class MobileApp implements Observer {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }
    public void update(double stockPrice) {
        System.out.println(appName + " received stock price update: $" + stockPrice);
    }
}