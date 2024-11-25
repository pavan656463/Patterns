package structural_design_pattern.Decoratror;

import java.io.*;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) throws IOException {
        // Compress data before writing
        super.writeData(compress(data));
    }

    @Override
    public String readData() throws IOException {
        // Decompress data after reading
        return decompress(super.readData());
    }

    private String compress(String data) {
        // Compression logic
        return data; // Simplified for demonstration
    }

    private String decompress(String compressedData) {
        // Decompression logic
        return compressedData; // Simplified for demonstration
    }
}


