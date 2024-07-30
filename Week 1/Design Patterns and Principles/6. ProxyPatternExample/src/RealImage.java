public class RealImage implements Image
{
    private String url;
    public RealImage(String url) {
        this.url = url;
        loadImageFromServer();
    }
    private void loadImageFromServer() {
        System.out.println("Loading image from " + url);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Image loaded from " + url);
    }
    public void display() {
        System.out.println("Displaying image from " + url);
    }
}