package ru.netology.mvnhw2.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServiceTest {
    @ParameterizedTest
  @CsvFileSource(files = "src/test/resources/rest.csv")
    public void restCalculationTest(int income, int expenses, int threshold) {
        RestService service = new RestService();
        int month = service.calculate(income, expenses, threshold);

        System.out.println(month);
    }
}
