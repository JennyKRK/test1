package example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PocketMoney {
    private final String description;
    private List<BigDecimal> pocketMoneyreceived;

    public PocketMoney(String description) {
        this.description = description;
        this.pocketMoneyreceived = new ArrayList<>();
    }

    public void addSomeMoney(BigDecimal someMoney) {
        pocketMoneyreceived.add(someMoney);
    }

    public BigDecimal countYourMoney() {
        BigDecimal total = BigDecimal.valueOf(0);
        int len = this.pocketMoneyreceived.size();
        if (len == 0) {
            return BigDecimal.valueOf(0);
        }
        for (int i = 0; i < len; i++) {
            BigDecimal pocketMoney = pocketMoneyreceived.get(i);
            total = total.add(pocketMoney);
        }
        return total;
    }

    public BigDecimal multiplyYourMoney(int multiplicator) {
        BigDecimal total = BigDecimal.valueOf(0);
        int len = this.pocketMoneyreceived.size();
        if (len == 0) {
            return BigDecimal.valueOf(0);
        }
        for (int i = 0; i < len; i++) {
            BigDecimal pocketMoney = pocketMoneyreceived.get(i)
                    .multiply(BigDecimal.valueOf(multiplicator));
            total = total.add(pocketMoney);
        }
        return total;
    }


}
