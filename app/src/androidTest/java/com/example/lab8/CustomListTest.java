package com.example.lab8;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.junit.Assert.assertEquals;

import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.example.lab8.CustomList;

import java.util.ArrayList;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class CustomListTest {
//    @Rule
//    public ActivityScenarioRule<MainActivity> scenario = new
//            ActivityScenarioRule<MainActivity>(MainActivity.class);


    @Test
    public void testAddContent(){
        CustomList testList = null;
        testList.addCity(new City("Winnipeg","MN"));
        assertEquals(testList.getCount(), 1);
    }
}
