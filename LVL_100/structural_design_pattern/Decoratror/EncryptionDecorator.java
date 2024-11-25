package structural_design_pattern.Decoratror;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EncryptionDecorator extends DataSourceDecorator {
    private static final int CAESAR_KEY = 3;

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) throws IOException {
        // Encrypt data before writing
        String encryptedData = encrypt(data);
        // Write encrypted data and key to file
        super.writeData("Original Data: " + data + "\n\n" + "Encrypted Data: " + encryptedData + "\nEncryption Key: " + CAESAR_KEY + "\n\n");

    }

    @Override
    public String readData() throws IOException {
        // Decrypt data after reading
        return decrypt(super.readData());
    }

    private String encrypt(String data) {
        // Caesar Cipher encryption logic
        StringBuilder encryptedData = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (Character.isLetter(c)) {
                char shiftedChar = (char) (c + CAESAR_KEY);
                if ((Character.isLowerCase(c) && shiftedChar > 'z') ||
                    (Character.isUpperCase(c) && shiftedChar > 'Z')) {
                    shiftedChar = (char) (c - (26 - CAESAR_KEY));
                }
                encryptedData.append(shiftedChar);
            } else {
                encryptedData.append(c);
            }
        }
        return encryptedData.toString();
    }

    private String decrypt(String encryptedData) {
        // Caesar Cipher decryption logic
        StringBuilder decryptedData = new StringBuilder();
        for (char c : encryptedData.toCharArray()) {
            if (Character.isLetter(c)) {
                char shiftedChar = (char) (c - CAESAR_KEY);
                if ((Character.isLowerCase(c) && shiftedChar < 'a') ||
                    (Character.isUpperCase(c) && shiftedChar < 'A')) {
                    shiftedChar = (char) (c + (26 - CAESAR_KEY));
                }
                decryptedData.append(shiftedChar);
            } else {
                decryptedData.append(c);
            }
        }
        return decryptedData.toString();
    }
}
