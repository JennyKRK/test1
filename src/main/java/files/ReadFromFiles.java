package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFromFiles {
    public static void main(String[] args) throws IOException {
        readFromFile("src/main/java/Files/Rozne.txt");
        readWhole("src/main/java/Files/Rozne.txt");
        readAndModify("src/main/java/Files/Rozne.txt");
    }

    public static void readFromFile(String fileName) throws IOException {
        try {
            File f = new File(fileName);
            BufferedReader br = Files.newBufferedReader(f.toPath());
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

    public static void readWhole(String fileName) throws IOException {
        try {
            String content = null;
            content = Files.readString(Paths.get(fileName));
            System.out.println(content);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

    public static void readAndModify(String fileName) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        try {
            String content = null;
            content = Files.readString(Paths.get(fileName));
            content = content.toLowerCase();
            Files.write(Path.of(fileName), content.getBytes(charset));

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

    public static void countChar(String fileName) throws IOException {
        File file = new File(fileName);
        int nextChar = 0;
        int linesCounter = 0;
        int charCounter = 0;
        BufferedReader reader = Files.newBufferedReader(file.toPath());
        while ((nextChar = reader.read()) != -1) {
            charCounter++;
            if (nextChar == '\n') {
                linesCounter++;
            }
        }
        System.out.println(linesCounter + " " + charCounter);
    }
}
