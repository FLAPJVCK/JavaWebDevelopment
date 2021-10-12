package by.epamtc.VaskevichArtsiom.task01.task01Test;

import by.epamtc.VaskevichArtsiom.task01.task01.Service;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @org.junit.jupiter.api.Test
    void lastSquareNumber() {
        Assertions.assertEquals(9, Service.lastSquareNumber(57));
        assertEquals(9,Service.lastSquareNumber(543));
        assertEquals(0,Service.lastSquareNumber(0));
        assertEquals(1,Service.lastSquareNumber(-89));
        assertEquals(4,Service.lastSquareNumber(22222));
        assertEquals(1,Service.lastSquareNumber(5111));
    }
}