package streams;

import java.io.*;

public class Read {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/streams/numbers.txt"));

            String numar;
            while((numar = reader.readLine()) !=null){
                System.out.println(numar);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
