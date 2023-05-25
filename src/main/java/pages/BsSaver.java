package pages;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Calendar;

public class BsSaver {
    public void printToAFile(List<String> firstList) throws FileNotFoundException {
        Calendar cal = Calendar.getInstance();
        String fileName = "test" + cal.get(Calendar.HOUR) + cal.get(Calendar.MINUTE) + ".txt";
        PrintWriter pw = new PrintWriter("src/main/java/myfiles2/" + fileName);
        firstList.stream().forEach(s -> pw.println(s));
        pw.close();
    }
}
