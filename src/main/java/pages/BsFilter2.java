package pages;

import java.util.List;
import java.util.stream.Collectors;

public class BsFilter2 implements Ibsfilter {
    @Override
    public List<String> filterExtracts(List<String> extracts) {
        return extracts.stream().filter(s -> s.length() > 30)
                .map(s -> s.toUpperCase()).collect(Collectors.toList());
    }
}
