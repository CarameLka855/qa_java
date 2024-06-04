import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void getSoundTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String catSoundActual = cat.getSound();
        Assert.assertEquals("Мяу",catSoundActual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        cat.getFood();
    }
}
