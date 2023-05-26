package pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Calendar;

public class BsSaver {
    public void printToAFile(List<String> firstList) throws FileNotFoundException {
        Calendar cal = Calendar.getInstance();
        String fileName = "test" + cal.get(Calendar.HOUR) + cal.get(Calendar.MINUTE) + ".txt";
        fileName = "src/main/java/files/" + fileName;
        PrintWriter pw = new PrintWriter(new FileOutputStream(new File(fileName), true));
        firstList.stream().forEach(s -> pw.println(s));
        pw.close();
    }

}

