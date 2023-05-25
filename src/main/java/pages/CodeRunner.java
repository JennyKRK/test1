package pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class CodeRunner {
    public static void main(String[] args) throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));
        System.out.println((cal.get(Calendar.HOUR_OF_DAY)));
        BiggerStructure bs = new BiggerStructure("https://www.gazeta.pl",
                new BsTextExtractor(), new BsSaver());
        bs.addFilter(new BsFilter());
        bs.addFilter(new BsFilter2());
        bs.addFilter(new BsFilter() {
            @Override
            public List<String> filterExtracts(List<String> extracts) {
                return extracts.stream()
                        .filter(s -> s.startsWith("p")).collect(Collectors.toList());
            }
        });
        bs.addFilter(new BsFilter() {
            @Override
            public List<String> filterExtracts(List<String> extracts) {
                return extracts.stream()
                        .map(s -> String.valueOf(s.length())).collect(Collectors.toList());
            }
        });
        bs.addFilter((sentences -> {
            return sentences.stream()
                    .filter(s -> s.startsWith("p")).collect(Collectors.toList());
        }));


        bs.addFilter((sentences -> {
            List<String> result = new ArrayList<>();
            for (String s : sentences) {
                if (s.trim().length() > 0 && s.charAt(0) == 'p') {
                    result.add(s);
                }
            }
            return result;
        }));
        bs.startMe();
    }
}
