package structural_design_pattern.Decoratror;

// Usage
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\pavan.k\\Desktop\\encrypted_data.txt";
        DataSource source = new FileDataSource(filePath);
        source = new CompressionDecorator(source);
        source = new EncryptionDecorator(source);

        source.writeData("Hello");

        String data = source.readData();
        System.out.println("Data: " + data);
    }
}

