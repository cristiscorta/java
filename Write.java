package streams;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Write {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/streams/numbers.txt",true));
            writer.write("6");
            writer.write("7");
            writer.write("8");
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
