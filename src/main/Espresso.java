import java.util.List;

public class Espresso implements Prepare{
    @Override
    public void makeCoffee(List<Ingredients> ingredients) {
        /*CoffeeMaker classından çağrılan bu metot Espresso'nun malzemelerini
        yazdırarak kullanıcıya geri bildirimde bulunur.*/

        System.out.print("Espresso seçtiniz. Bu içeceğimiz ");
        ingredients.forEach(in->{
            System.out.print(in.getName() + ",");
        });
        System.out.println("malzemelerinden oluşmaktadır.");

    }
}