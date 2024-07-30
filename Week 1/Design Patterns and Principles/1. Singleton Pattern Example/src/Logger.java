public class Logger {
    // a variable to store the instance of class
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
    }

    // public method to return the instance of Logger class
    public static Logger getInstance() {
        if (instance == null)
            instance = new Logger();
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
