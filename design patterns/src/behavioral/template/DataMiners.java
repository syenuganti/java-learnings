package behavioral.template;

public class PDFDataMiner extends DataMiner {
    @Override
    void openFile(String path) {
        System.out.println("Opening PDF file: " + path);
    }

    @Override
    void extractData() {
        System.out.println("Extracting text and metadata from PDF");
    }

    @Override
    void closeFile() {
        System.out.println("Closing PDF file resources");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing PDF-specific formatting and layout");
    }
}

class CSVDataMiner extends DataMiner {
    @Override
    void openFile(String path) {
        System.out.println("Opening CSV file: " + path);
    }

    @Override
    void extractData() {
        System.out.println("Reading CSV rows and columns");
    }

    @Override
    void closeFile() {
        System.out.println("Closing CSV file reader");
    }

    @Override
    protected void analyzeData() {
        System.out.println("Performing statistical analysis on structured CSV data");
    }
}

class DocxDataMiner extends DataMiner {
    @Override
    void openFile(String path) {
        System.out.println("Opening Word document: " + path);
    }

    @Override
    void extractData() {
        System.out.println("Extracting text, tables, and formatting from Word document");
    }

    @Override
    void closeFile() {
        System.out.println("Closing Word document resources");
    }

    @Override
    protected void sendReport() {
        System.out.println("Sending detailed Word document analysis report");
    }
}
