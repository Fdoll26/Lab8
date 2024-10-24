package com.example.lab8;

import org.junit.Before;
//import org.junit.Test;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CustomListTest {

    private CustomList list;

    @Before
    public void setUp() {
        list = new CustomList(null, new ArrayList<>());
    }


    @Test
    public void testAddCityTest() {
        CustomList testlist = new CustomList(null,new ArrayList<>());
        int listSize = testlist.getCount();
        testlist.addCity(new City("Estevan", "SK"));
        assertEquals(testlist.getCount(), listSize + 1);
    }


    @Test
    public void testHasCity(){
        CustomList testlist = new CustomList(null,new ArrayList<>());
        City test = new City("Winnipeg", "MN");
        testlist.addCity(test);
        assertEquals(testlist.hasCity(test), true);
    }

    @Test
    public void testDeleteCity(){
        CustomList testlist = new CustomList(null,new ArrayList<>());
        City test = new City("Winnipeg", "MN");
        City test1 = new City("Edmonton", "AB");
        testlist.addCity(test);
        testlist.addCity(test1);
        testlist.deleteCity(test1);
        assertEquals(testlist.hasCity(test1), false);
        assertEquals(testlist.getCount(), 1);
    }
    @Test
    public void testCountCity(){
        CustomList testlist = new CustomList(null,new ArrayList<>());
        City test = new City("Winnipeg", "MN");
        City test1 = new City("Edmonton", "AB");
        testlist.addCity(test);
        testlist.addCity(test1);
        assertEquals(testlist.getCityCount(), 2);
    }



}
