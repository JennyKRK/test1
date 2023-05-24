package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SaveToAFile {
    public static void main(String[] args) throws FileNotFoundException {
        String[] names = {"Allie", "Bob", "Cillian", "Dorian", "Emil"};
        saveAndReplace(names, "src/main/java/Files/Proba.txt");
        saveToFileAndAdd(names, "src/main/java/Files/Proba2.txt");
    }


    public static void saveAndReplace(String[] names, String name) throws FileNotFoundException {
        try {
            PrintWriter pw = new PrintWriter(name);

            for (String s : names) {
                pw.println(s);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + name);
        }
    }

    public static void saveToFileAndAdd(String[] names, String fileName) {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File(fileName), true));
            for (String s : names) {
                pw.println(s);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
