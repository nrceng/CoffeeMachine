
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * @author nurca
 * CoffeeMakerTest class'ın içinde malzeme eksiltmesini kontrol eden testler yazıldı.
 **/
public class CoffeeMakerTest {

    private CoffeeMaker coffeeMaker;


    @BeforeEach //Her testten önce bu metotu çağırır.
    public void setup(){
        coffeeMaker = new CoffeeMaker();
    }

    public void mochaResourceTest(){
        //Mocha yapıldıktan sonra malzeme eksiltmesini doğru yapıp yapılmadığını kontrol eden test.
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
        //Cappuccino yapıldıktan sonra malzeme eksiltmesini doğru yapıp yapılmadığını kontrol eden test.
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
        //CaffeLatte yapıldıktan sonra malzeme eksiltmesini doğru yapıp yapılmadığını kontrol eden test.
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
        //Espresso yapıldıktan sonra malzeme eksiltmesini doğru yapıp yapılmadığını kontrol eden test.
        coffeeMaker.espresso = 10;

        coffeeMaker.goToSelection(1);

        Assertions.assertEquals(9, coffeeMaker.getEspressoResource());

    }

    @Test
    public void doubleEspressoResourceTest(){
        //Double Espresoo yapıldıktan sonra malzeme eksiltmesini doğru yapıp yapılmadığını kontrol eden test.
        coffeeMaker.espresso = 10;

        coffeeMaker.goToSelection(2);

        Assertions.assertEquals(8, coffeeMaker.getEspressoResource());

    }

    @Test
    public void hotWaterResourceTest(){
        //Hot Water yapıldıktan sonra malzeme eksiltmesini doğru yapıp yapılmadığını kontrol eden test.
        coffeeMaker.hotWater = 10;

        coffeeMaker.goToSelection(7);

        Assertions.assertEquals(5, coffeeMaker.getHotWaterResource());

    }

    @Test
    public void americanoResourceTest(){
        //Americano yapıldıktan sonra malzeme eksiltmesini doğru yapıp yapılmadığını kontrol eden test.
        coffeeMaker.hotWater = 10;
        coffeeMaker.espresso = 10;

        coffeeMaker.goToSelection(6);

        Assertions.assertEquals(6, coffeeMaker.getHotWaterResource());
        Assertions.assertEquals(9, coffeeMaker.getEspressoResource());

    }
}


