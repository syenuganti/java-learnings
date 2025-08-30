package behavioral.chain;

public class SupportTicket {
    private String description;
    private int severity; // 1-Low, 2-Medium, 3-High

    public SupportTicket(String description, int severity) {
        this.description = description;
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public int getSeverity() {
        return severity;
    }
}
