import java.util.Scanner;

interface Document {
    void open();
    void save();
    void close();
    void export(String format);
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Document.");
    }
    public void save() {
        System.out.println("Saving Word Document.");
    }
    public void close() {
        System.out.println("Closing Word Document.");
    }
    public void export(String format) {
        System.out.println("Exporting Word Document as " + format);
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document.");
    }
    public void save() {
        System.out.println("Saving PDF Document.");
    }
    public void close() {
        System.out.println("Closing PDF Document.");
    }
    public void export(String format) {
        System.out.println("Exporting PDF Document as " + format);
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document.");
    }
    public void save() {
        System.out.println("Saving Excel Document.");
    }
    public void close() {
        System.out.println("Closing Excel Document.");
    }
    public void export(String format) {
        System.out.println("Exporting Excel Document as " + format);
    }
}

enum DocumentType {
    WORD, PDF, EXCEL
}

class DocumentFactory {
    public static Document createDocument(DocumentType type) {
        switch (type) {
            case WORD: return new WordDocument();
            case PDF: return new PdfDocument();
            case EXCEL: return new ExcelDocument();
            default: throw new IllegalArgumentException("Unknown document type");
        }
    }
}

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter document type (WORD, PDF, EXCEL): ");
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            DocumentType type = DocumentType.valueOf(input);
            Document doc = DocumentFactory.createDocument(type);
            doc.open();
            doc.save();
            doc.export("TXT");
            doc.close();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid document type.");
        }
    }
}
