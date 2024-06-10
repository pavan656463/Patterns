package structural_design_pattern.Decoratror;

import java.io.*;

public abstract class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) throws IOException {
        wrappee.writeData(data);
    }

    @Override
    public String readData() throws IOException {
        return wrappee.readData();
    }
}


