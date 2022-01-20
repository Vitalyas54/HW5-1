package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"100,200,5", "200,300,3", "100,101,1", "299,300,0"})
    void squareCountFromMinToMax(int min, int max, int expected) {
        SQRService sqrService = new SQRService();
        int actual = sqrService.squareCount(min, max);

        assertEquals(expected, actual);
    }
}