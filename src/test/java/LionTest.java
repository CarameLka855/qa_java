import com.example.Feline;
import com.example.IFeline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
@RunWith(MockitoJUnitRunner.Silent.class)
public class LionTest {

    IFeline feline = new Feline();
    Lion lion = new Lion(feline);

    @Mock
    IFeline felineFood;

    @Test
    public void getKittensTest() {
        int kittensCountActual = lion.getKittens();
        int kittensCountExpected = 1;
        Assert.assertEquals(kittensCountExpected,kittensCountActual);
    }

    // Проверка корректного вызова метода getFood() в изоляции
    @Test
    public void getFoodTest() throws Exception {
        Lion lionFood = new Lion(felineFood);
        List<String> eatMeatCollections = new ArrayList<>();
        eatMeatCollections.add("Животные");
        eatMeatCollections.add("Птицы");
        eatMeatCollections.add("Рыба");
        Mockito.when(lionFood.getFood()).thenReturn(eatMeatCollections);
    }

}
