import java.util.List;

public class Mocha implements Prepare{
    @Override
    public void makeCoffee(List<Ingredients> ingredients) {
        /*CoffeeMaker classından çağrılan bu metot Mocha'nın malzemelerini
        yazdırarak kullanıcıya geri bildirimde bulunur.*/

        System.out.print("Mocha seçtiniz. Bu içeceğimiz ");
        ingredients.forEach(in->{
            System.out.print(in.getName() + ",");
        });
        System.out.println("malzemelerinden oluşmaktadır.");
    }
}
