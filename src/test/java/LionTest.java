import com.example.Feline;
import com.example.IFeline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

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
        List<String> eatMeatCollectionsExpected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(felineFood.getFood("Хищник")).thenReturn(eatMeatCollectionsExpected);
        List<String> lionFoodsActual = lion.getFood();
        Assert.assertEquals(eatMeatCollectionsExpected,lionFoodsActual);
    }

    @Test
    public void lionConstructorExceptionTest() {
        Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Детеныш");
        });
    }

}
