package ru.netology.bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceTest {

    @ParameterizedTest
    //@CsvSource({
    //       "30,1000,true",
    //       "500,1000000,true",
    //       "10,1000,false",
    //       "500,550000,false"
    //  })
    @CsvFileSource(files = "src/test/resources/data.csv")

    public void shouldCalculateBonus(long expected, long amount, boolean registered) {

        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

}
