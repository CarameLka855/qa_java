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


    @Mock
    IFeline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int kittensCountActual = lion.getKittens();
        int kittensCountExpected = 1;
        Assert.assertEquals(kittensCountExpected,kittensCountActual);
    }

    // Проверка корректного вызова метода getFood() в изоляции
    @Test
    public void getFoodTest() throws Exception {
        List<String> eatMeatCollectionsExpected = List.of("Животные", "Птицы", "Рыба");
        Lion lionFood = new Lion("Самец",feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(eatMeatCollectionsExpected);
        List<String> lionFoodsActual = lionFood.getFood();
        Assert.assertEquals(eatMeatCollectionsExpected,lionFoodsActual);
    }

    @Test
    public void lionConstructorExceptionTest() {
        Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Детеныш",feline);
        });
    }

}
