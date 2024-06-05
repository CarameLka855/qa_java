import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.Silent.class)
public class CatTest {

    @Mock
    Predator predator;

    @Test
    public void getSoundTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String catSoundActual = cat.getSound();
        Assert.assertEquals("Мяу",catSoundActual);
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> foodsExpected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(foodsExpected);
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> catFoodsActual = cat.getFood();
        Assert.assertEquals(foodsExpected,catFoodsActual);
    }
}
