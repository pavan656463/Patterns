package structural_design_pattern.Decoratror;

import java.io.IOException;

public interface DataSource {
    void writeData(String data) throws IOException;
    String readData() throws IOException;
}

