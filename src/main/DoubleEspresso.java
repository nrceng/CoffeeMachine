import java.util.List;

public class DoubleEspresso implements Prepare {
    @Override
    public void makeCoffee(List<Ingredients> ingredients) {
        System.out.print("Double Espresso seçtiniz. Bu içeceğimiz ");
        ingredients.forEach(in->{
            System.out.print(in.getName() + ",");
        });
        System.out.println("malzemelerinden oluşmaktadır.");

    }
}
