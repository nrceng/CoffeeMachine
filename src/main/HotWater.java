import java.util.List;

public class HotWater implements Prepare {
    @Override
    public void makeCoffee(List<Ingredients> ingredients) {
        /*CoffeeMaker classından çağrılan bu metot Hot Water'ın malzemelerini
        yazdırarak kullanıcıya geri bildirimde bulunur.*/

        System.out.print("Hot Water seçtiniz. Bu içeceğimiz ");
        ingredients.forEach(in->{
            System.out.print(in.getName() + ",");
        });
        System.out.println("malzemelerinden oluşmaktadır.");
    }
}
