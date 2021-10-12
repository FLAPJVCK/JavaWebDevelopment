package by.epamtc.VaskevichArtsiom.task01.task02Test;

import by.epamtc.VaskevichArtsiom.task01.task02.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    void daysInMonth() {
        Assertions.assertEquals(30, Service.daysInMonth(1999,6));
        assertEquals(29, Service.daysInMonth(2000,2));
        assertEquals(31, Service.daysInMonth(2021,8));
        assertEquals(31, Service.daysInMonth(2021,10));
        assertEquals(30, Service.daysInMonth(500,11));
        assertEquals(31, Service.daysInMonth(2077,1));
    }

    @Test
    void isItLeapYear() {
        assertEquals(29, Service.isItLeapYear(2000));
        assertEquals(28, Service.isItLeapYear(2014));
        assertEquals(28, Service.isItLeapYear(1999));
        assertEquals(28, Service.isItLeapYear(2021));
        assertEquals(29, Service.isItLeapYear(2024));
        assertEquals(29, Service.isItLeapYear(40));
        assertEquals(28, Service.isItLeapYear(10));
    }
}