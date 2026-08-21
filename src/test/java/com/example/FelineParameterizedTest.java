package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    @Parameterized.Parameter
    public int kittensCount;

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][]{
                {1},
                {3},
                {5}
        };
    }

    @Test
    public void getKittensWithCountTest() {
        Feline feline = new Feline();

        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}