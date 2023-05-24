package example;

import static org.junit.Assert.*;

import example.PocketMoney;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PocketMoneyTest {

    @Test
    public void isSumCorrect(){
        PocketMoney pm = new PocketMoney("For Jimmy");
        pm.addSomeMoney(BigDecimal.valueOf(100));
        pm.addSomeMoney(BigDecimal.valueOf(200));
        Assert.assertThat(new BigDecimal("300"), Matchers.comparesEqualTo(pm.countYourMoney()));
    }

    @Test
    public void GrandmasGift(){
        PocketMoney pm = new PocketMoney("For Maisie, for she was a good girl");
        pm.addSomeMoney(BigDecimal.valueOf(100));
        pm.addSomeMoney(BigDecimal.valueOf(200));

        Assert.assertThat(new BigDecimal("600"), Matchers.comparesEqualTo(pm.multiplyYourMoney(2)));
    }
}