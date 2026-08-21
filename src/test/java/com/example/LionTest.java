package com.example;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.util.List;

public class LionTest {

    @Test
    public void lionMaleHasManeTest() throws Exception {
        Feline feline = mock(Feline.class);

        Lion lion = new Lion("Самец", feline);

        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void lionFemaleDoesNotHaveManeTest() throws Exception {
        Feline feline = mock(Feline.class);

        Lion lion = new Lion("Самка", feline);

        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void invalidSexThrowsExceptionTest() throws Exception {
        Feline feline = mock(Feline.class);

        new Lion("Что-то другое", feline);
    }

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = mock(Feline.class);

        when(feline.getKittens()).thenReturn(5);

        Lion lion = new Lion("Самец", feline);

        assertEquals(5, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = mock(Feline.class);

        List<String> food = List.of("Животные", "Птицы", "Рыба");

        when(feline.getFood("Хищник")).thenReturn(food);

        Lion lion = new Lion("Самец", feline);

        assertEquals(food, lion.getFood());
    }

}
