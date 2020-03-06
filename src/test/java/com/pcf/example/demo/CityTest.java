package com.pcf.example.demo;

import com.pcf.example.demo.entity.City;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityTest {

    @Test
    public void testPostal() {
        City city = new City("Beijing", "010");
        assertEquals("010", city.getPostal_code());
    }

}
