import java.util.List;

public class DoubleEspresso implements Prepare {
    @Override
    public void makeCoffee(List<Ingredients> ingredients) {
        /*CoffeeMaker classından çağrılan bu metot Double Espresso'nun malzemelerini
        yazdırarak kullanıcıya geri bildirimde bulunur.*/

        System.out.print("Double Espresso seçtiniz. Bu içeceğimiz ");
        ingredients.forEach(in->{
            System.out.print(in.getName() + ",");
        });
        System.out.println("malzemelerinden oluşmaktadır.");

    }
}
