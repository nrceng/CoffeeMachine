
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoffeeMakerTest {

    private CoffeeMaker coffeeMaker;

    //her testten önce bu metotu çağırır.
    @BeforeEach
    public void setup(){
        coffeeMaker = new CoffeeMaker();
    }

    public void mochaResourceTest(){
        coffeeMaker.espresso = 10;
        coffeeMaker.milkFoam = 10;
        coffeeMaker.hotChocolate =10;
        coffeeMaker.steamedMilk =10;

        coffeeMaker.goToSelection(5);

        Assertions.assertEquals(9, coffeeMaker.getEspressoResource());
        Assertions.assertEquals(9, coffeeMaker.getMilkFoamResource());
        Assertions.assertEquals(8, coffeeMaker.getHotChocolateResource());
        Assertions.assertEquals(9, coffeeMaker.getSteamedMilkResource());

    }

    @Test
    public void cappuccinoResourceTest(){
        coffeeMaker.espresso = 10;
        coffeeMaker.milkFoam = 10;
        coffeeMaker.steamedMilk =10;

        coffeeMaker.goToSelection(3);

        Assertions.assertEquals(9, coffeeMaker.getEspressoResource());
        Assertions.assertEquals(8, coffeeMaker.getMilkFoamResource());
        Assertions.assertEquals(8, coffeeMaker.getSteamedMilkResource());

    }

    @Test
    public void caffeLatteResourceTest(){
        coffeeMaker.espresso = 10;
        coffeeMaker.milkFoam = 10;
        coffeeMaker.steamedMilk =10;

        coffeeMaker.goToSelection(4);

        Assertions.assertEquals(9, coffeeMaker.getEspressoResource());
        Assertions.assertEquals(9, coffeeMaker.getMilkFoamResource());
        Assertions.assertEquals(7, coffeeMaker.getSteamedMilkResource());

    }

    @Test
    public void espressoResourceTest(){
        coffeeMaker.espresso = 10;

        coffeeMaker.goToSelection(1);

        Assertions.assertEquals(9, coffeeMaker.getEspressoResource());

    }

    @Test
    public void doubleEspressoResourceTest(){
        coffeeMaker.espresso = 10;

        coffeeMaker.goToSelection(2);

        Assertions.assertEquals(8, coffeeMaker.getEspressoResource());

    }

    @Test
    public void hotWaterResourceTest(){
        coffeeMaker.hotWater = 10;

        coffeeMaker.goToSelection(7);

        Assertions.assertEquals(5, coffeeMaker.getHotWaterResource());

    }

    @Test
    public void americanoResourceTest(){
        coffeeMaker.hotWater = 10;
        coffeeMaker.espresso = 10;

        coffeeMaker.goToSelection(6);

        Assertions.assertEquals(6, coffeeMaker.getHotWaterResource());
        Assertions.assertEquals(9, coffeeMaker.getEspressoResource());

    }
}


