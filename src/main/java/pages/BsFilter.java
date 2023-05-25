package pages;

import java.util.List;
import java.util.stream.Collectors;

public class BsFilter implements Ibsfilter {
    public List<String> filterExtracts(List<String> extracts) {
        List<String> filteredExtracts = null;
        filteredExtracts = extracts.stream()
                .filter(s -> s.contains("ł")).collect(Collectors.toList());
        return filteredExtracts;
    }
}
