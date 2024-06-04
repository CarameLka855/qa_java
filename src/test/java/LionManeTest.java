import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionManeTest {
    private final String lionSex;
    private final boolean lionMane;

    public LionManeTest(String lionSex, boolean lionMane) {
        this.lionSex = lionSex;
        this.lionMane = lionMane;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Детеныш", false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        try {
            Lion lion = new Lion(lionSex);
            boolean lionHaveManeActual = lion.doesHaveMane();
            Assert.assertEquals(lionMane, lionHaveManeActual);
        }
        catch (Exception e) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }
}
