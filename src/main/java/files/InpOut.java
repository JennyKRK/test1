package files;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.File;

public class InpOut {
    public static void main(String[] args) throws Exception {
        testOut("src/main/java/Files/a.ser", "A");
        testOut2("src/main/java/Files/b.ser", "A");
        testIn("src/main/java/Files/b.ser");
        testIn2("src/main/java/Files/b.ser");
    }

    public static void testOut(String path, String a) throws IOException, ClassNotFoundException {
        FileOutputStream fileOut = new FileOutputStream(path);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(a);
        out.close();
        fileOut.close();

        FileInputStream fileIn = new FileInputStream("src/main/java/Files/a.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        a = (String) in.readObject();
        in.close();
        fileIn.close();
        System.out.println(a);
    }

    public static void testOut2(String path, String a) throws IOException, ClassNotFoundException {
        FileOutputStream fileOut = new FileOutputStream(path);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(a);
        out.writeChars("test");
        out.writeChars("ttttttttt");
        out.close();
        fileOut.close();
    }

    public static void testIn(String path) throws IOException, ClassNotFoundException {
        {
            File file = new File(path);

            try (InputStream in = new FileInputStream(file)) {
                int content;
                while ((content = in.read()) != -1) {
                    System.out.print((char) content);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void testIn2(String path) throws IOException {
        FileInputStream fileIn = new FileInputStream(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileIn));
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line.toString());
        }

    }

}
