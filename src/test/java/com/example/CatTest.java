package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.List;

public class CatTest {

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(new Feline());

        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = mock(Feline.class);

        when(feline.eatMeat()).thenReturn(
                List.of("Животные", "Птицы", "Рыба")
        );

        Cat cat = new Cat(feline);

        assertEquals(
                List.of("Животные", "Птицы", "Рыба"),
                cat.getFood()
        );
    }

}
