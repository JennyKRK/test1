package inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class CodeRunnerS {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SimpleStream s0 = setup();
        SimpleStream s1 = setup2();
        saveSimToFile(s0, "src/main/files/test.ser");
        saveSimToFile(s1, "src/main/files/test2.ser");
        SimpleStream s2 = readSimple("src/main/files/test2.ser");
        SimpleStream oldS = readSimple("src/main/files/test.ser");
        printSimpleStream(s2);
        printSimpleStream(oldS);


    }

    private static SimpleStream setup() {
        SimpleStream simple = new SimpleStream("Maia");
        simple.addABook("Germinal");
        simple.addABook("Nana");
        return simple;
    }

    private static SimpleStream setup2() {
        SimpleStream simple = new SimpleStream("Connie");
        simple.addABook("Harry Potter");
        simple.addABook("Throne of Glass");
        return simple;
    }

    private static void saveSimToFile(SimpleStream simple, String file) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(simple);
        out.close();
        fileOut.close();
    }

    public static SimpleStream readSimple(String file) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        SimpleStream simpleStream = (SimpleStream) in.readObject();
        in.close();
        fileIn.close();
        return simpleStream;
    }

    public static void printSimpleStream(SimpleStream s) {
        System.out.println(s.getName());
        System.out.println(s.getBooksRead());
    }
}
