package srp;

// Bad example - violates SRP
class InvoiceWithoutSRP {
    private double amount;
    private String customer;

    public InvoiceWithoutSRP(double amount, String customer) {
        this.amount = amount;
        this.customer = customer;
    }

    // Invoice class handling multiple responsibilities
    public void calculateTotal() {
        // Calculate total with tax, discounts, etc.
    }

    public void saveToDatabase() {
        // Save invoice to database
    }

    public void printInvoice() {
        // Print invoice
    }

    public void emailInvoice() {
        // Email invoice
    }
}

// Good example - follows SRP
class Invoice {
    private double amount;
    private String customer;

    public Invoice(double amount, String customer) {
        this.amount = amount;
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomer() {
        return customer;
    }
}

// Separate class for database operations
class InvoicePersistence {
    public void saveToDatabase(Invoice invoice) {
        // Save invoice to database
    }
}

// Separate class for printing functionality
class InvoicePrinter {
    public void print(Invoice invoice) {
        // Print invoice
    }
}

// Separate class for email functionality
class InvoiceEmailSender {
    public void email(Invoice invoice) {
        // Email invoice
    }
}
