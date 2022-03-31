package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"200,300,3", "100,9999,81", "0,100,1", "100,1000,22", "10,15,0"})
    void shouldCalculateSqrService(int underRange, int upperRange, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculateSqrService(underRange, upperRange);

        assertEquals(expected, actual);
    }
}