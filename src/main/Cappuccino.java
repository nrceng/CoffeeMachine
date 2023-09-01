import java.util.List;

public class Cappuccino implements Prepare {
    @Override
    public void makeCoffee(List<Ingredients> ingredients) {
        /*CoffeeMaker classından çağrılan bu metot Cappuccino'nun malzemelerini
        yazdırarak kullanıcıya geri bildirimde bulunur.*/

        System.out.print("Cappuccino seçtiniz. Bu içeceğimiz ");
        ingredients.forEach(in->{
            System.out.print(in.getName() + ",");
        });
        System.out.println("malzemelerinden oluşmaktadır.");
    }
}
