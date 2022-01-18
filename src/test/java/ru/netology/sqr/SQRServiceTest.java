package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"100,200,5"})
    void squareCountFrom100To200(int min, int max, int expected) {
        SQRService sqrService = new SQRService();
        int actual = sqrService.squareCount(min, max);

        assertEquals(expected, actual);
    }

    @Test
    void squareCountFrom200To300() {
        SQRService sqrService = new SQRService();
        int min = 200;
        int max = 300;
        int expected = 3;
        int actual = sqrService.squareCount(min, max);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"100,101,1"})
    void squareCountFrom100To101(int min, int max, int expected) {
        SQRService sqrService = new SQRService();
        int actual = sqrService.squareCount(min, max);

        assertEquals(expected, actual);
    }

    @Test
    void squareCountFrom299To300() {
        SQRService sqrService = new SQRService();
        int min = 299;
        int max = 300;
        int expected = 0;
        int actual = sqrService.squareCount(min, max);

        assertEquals(expected, actual);
    }
}