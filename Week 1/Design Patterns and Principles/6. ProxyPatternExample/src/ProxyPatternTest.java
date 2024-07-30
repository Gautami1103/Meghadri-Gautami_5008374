public class ProxyPatternTest
{
    public static void main(String[] args) {
        Image image1 = new ProxyImage("https://reintech.io/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBBcE92IiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn19--fad1798a0724346fb3558300c60f2214c11b10de/g7gkf264e2xo4c6hvduj3owlo8vx");
        Image image2 = new ProxyImage("https://content.techgig.com/photo/77766881/4-tips-to-effectively-understand-java-programming-language.jpg?142209");
        image1.display();
        System.out.println();
        image1.display();
        System.out.println();
        image2.display();
        System.out.println();
        image2.display();
    }
}