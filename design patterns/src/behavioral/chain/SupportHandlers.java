package behavioral.chain;

// Level 1 Support Handler - Handles basic issues
class Level1Support extends SupportHandler {
    public Level1Support() {
        this.level = 1;
    }

    @Override
    protected boolean canHandle(SupportTicket ticket) {
        return ticket.getSeverity() == 1;
    }

    @Override
    protected void processTicket(SupportTicket ticket) {
        System.out.println("Level 1 Support handling ticket: " + ticket.getDescription());
        System.out.println("Providing basic troubleshooting steps...");
    }
}

// Level 2 Support Handler - Handles moderate issues
class Level2Support extends SupportHandler {
    public Level2Support() {
        this.level = 2;
    }

    @Override
    protected boolean canHandle(SupportTicket ticket) {
        return ticket.getSeverity() == 2;
    }

    @Override
    protected void processTicket(SupportTicket ticket) {
        System.out.println("Level 2 Support handling ticket: " + ticket.getDescription());
        System.out.println("Performing advanced troubleshooting...");
    }
}

// Level 3 Support Handler - Handles complex issues
class Level3Support extends SupportHandler {
    public Level3Support() {
        this.level = 3;
    }

    @Override
    protected boolean canHandle(SupportTicket ticket) {
        return ticket.getSeverity() == 3;
    }

    @Override
    protected void processTicket(SupportTicket ticket) {
        System.out.println("Level 3 Support handling ticket: " + ticket.getDescription());
        System.out.println("Investigating core system issues...");
    }
}
