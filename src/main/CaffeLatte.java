import java.util.List;

public class CaffeLatte implements Prepare {
    @Override
    public void makeCoffee(List<Ingredients> ingredients) {
        /*CoffeeMaker classından çağrılan bu metot CaffeLatte'nin malzemelerini
        yazdırarak kullanıcıya geri bildirimde bulunur.*/

        System.out.print("Caffe Latte seçtiniz. Bu içeceğimiz ");
        ingredients.forEach(in->{
            System.out.print(in.getName() + ",");
        });
        System.out.println("malzemelerinden oluşmaktadır.");

    }
}
