import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.Silent.class)
public class FelineTest {

    @Mock
    Feline feline;

// Проверка корректного вызова метода eatMeat() в изоляции от класса Animal
    @Test
    public void geteatMeatTest() throws Exception {
        List<String> eatMeatCollections = new ArrayList<>();
        eatMeatCollections.add("Животные");
        eatMeatCollections.add("Птицы");
        eatMeatCollections.add("Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(eatMeatCollections);
    }

    @Test
    public void getFamilyTest() {
        Feline felineFamily = new Feline();
        String felineFamilyActual = felineFamily.getFamily();
        Assert.assertEquals("Кошачьи",felineFamilyActual);
    }

    @Test
    public void getKittensWithoutArg() {
        Feline feline = new Feline();
        int getKittensActual = feline.getKittens();
        Assert.assertEquals(1,getKittensActual);
    }

    @Test
    public void getKittensWithArg() {
        Feline feline = new Feline();
        int kittensCountExpected = 13;
        int getKittensActual = feline.getKittens(kittensCountExpected);
        Assert.assertEquals(kittensCountExpected,getKittensActual);
    }
}
