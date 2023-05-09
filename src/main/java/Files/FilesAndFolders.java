package Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;

public class FilesAndFolders {
    public static void main(String[] args) throws IOException {
        listFilesFromAFolder("src/main/java/Files");
        copyThisFile("src/main/java/Files/Proba.txt");
        getAttributes("src/main/java/Files/Kopia.txt");
    }
    public static void listFilesFromAFolder(String folderName){
        try {
            File folder = new File(folderName);
            List<File> listOfFiles = List.of(folder.listFiles());
            for (File f : listOfFiles) {
                System.out.println(f.getName());
            }
        } catch (Exception e) {
            System.out.println("Folder does not exist");
        }
    }

    public static void getAttributes(String fileName) throws IOException {
        File folder = new File(fileName);
        BasicFileAttributes attr = Files.readAttributes(Paths.get(fileName),BasicFileAttributes.class);
        System.out.println(attr.creationTime());
    }
    public static void copyThisFile(String fileName) throws IOException {
        try {
            File file = new File(fileName);
            if (file.exists()) {
                Files.copy(Path.of(fileName), Path.of("src/main/java/Files/Kopia.txt"));
            }
        }
        catch (FileAlreadyExistsException e){
            System.out.println("This file already exists");
        }
    }
}