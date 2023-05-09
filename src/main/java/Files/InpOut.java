package Files;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class InpOut {
    public static void main(String[] args) throws Exception {
        TestOut("src/main/java/Files/a.ser", "A");
        TestOut2("src/main/java/Files/b.ser", "A");
        TestIn("src/main/java/Files/b.ser");
        TestIn2("src/main/java/Files/b.ser");
    }
    public static void TestOut(String path, String a) throws IOException, ClassNotFoundException {
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

    public static void TestOut2(String path, String a) throws IOException, ClassNotFoundException {
        FileOutputStream fileOut = new FileOutputStream(path);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(a);
        out.writeChars("test");
        out.writeChars("ttttttttt");
        out.close();
        fileOut.close();}

    public static void TestIn(String path) throws IOException, ClassNotFoundException {
        {
            File file = new File(path);

            try (InputStream in = new FileInputStream(file))
            {
                int content;
                while ((content = in.read()) != -1) {
                    System.out.print((char)content);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void TestIn2(String path) throws IOException {
        FileInputStream fileIn = new FileInputStream(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileIn));
        String line = null;
        while((line = reader.readLine()) != null) {
            System.out.println(line.toString());
        }

    }

}
