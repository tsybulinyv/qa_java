package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class FelineTest {

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();

        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();

        assertEquals(1, feline.getKittens());
    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();

        assertEquals(
                List.of("Животные", "Птицы", "Рыба"),
                feline.eatMeat()
        );
    }
}
