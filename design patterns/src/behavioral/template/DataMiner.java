package behavioral.template;

/**
 * Abstract class defining the template method for data mining process
 */
public abstract class DataMiner {
    // Template method that defines the algorithm structure
    public final void mine(String path) {
        openFile(path);
        extractData();
        parseData();
        analyzeData();
        sendReport();
        closeFile();
    }

    // Abstract methods that must be implemented by subclasses
    abstract void openFile(String path);
    abstract void extractData();
    abstract void closeFile();

    // Common methods with default implementations
    protected void parseData() {
        System.out.println("Parsing data in a standard format...");
    }

    protected void analyzeData() {
        System.out.println("Analyzing data using standard statistical methods...");
    }

    // Hook method that can be overridden
    protected void sendReport() {
        System.out.println("Sending generic report...");
    }
}
