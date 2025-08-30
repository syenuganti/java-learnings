package behavioral.observer;

public class EmailSubscriber implements NewsSubscriber {
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String news) {
        System.out.println("Sending news to " + email + ": " + news);
    }
}

public class SMSSubscriber implements NewsSubscriber {
    private String phoneNumber;

    public SMSSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String news) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + news);
    }
}
