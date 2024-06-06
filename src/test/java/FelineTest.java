import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.Silent.class)
public class FelineTest {

    @Spy
    Feline feline;

// Проверка корректного вызова метода eatMeat() в изоляции от класса Animal
    @Test
    public void getEatMeatTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
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
