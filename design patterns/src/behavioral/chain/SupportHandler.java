package behavioral.chain;

/**
 * Abstract handler class defines the template for support handlers
 */
public abstract class SupportHandler {
    protected SupportHandler nextHandler;
    protected int level;

    public void setNextHandler(SupportHandler handler) {
        this.nextHandler = handler;
    }

    public void handleTicket(SupportTicket ticket) {
        if (canHandle(ticket)) {
            processTicket(ticket);
        } else if (nextHandler != null) {
            nextHandler.handleTicket(ticket);
        } else {
            System.out.println("No handler available for ticket: " + ticket.getDescription());
        }
    }

    protected abstract boolean canHandle(SupportTicket ticket);
    protected abstract void processTicket(SupportTicket ticket);
}
