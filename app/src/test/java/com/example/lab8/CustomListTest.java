package com.example.lab8;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomListTest {

    private CustomList list;

    @Before
    public void setUp() {
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void dummyTest() {
        assertEquals(1, 2); // This should fail
    }

    @Test
    public void testAddCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }
}
