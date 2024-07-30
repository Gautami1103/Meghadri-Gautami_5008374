public class DecoratorPatternTest
{
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsDecorator = new SMSNotifierDecorator(emailNotifier);
        Notifier slackDecorator = new SlackNotifierDecorator(smsDecorator);

        slackDecorator.send("Hello, world! Life is so beautiful");
    }
}