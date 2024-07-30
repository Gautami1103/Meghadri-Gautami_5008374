public abstract class NotifierDecorator implements Notifier
{
    public Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override

    public void send(String message) {
        notifier.send(message);
    }
}
