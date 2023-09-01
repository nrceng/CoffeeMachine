import java.util.List;

public class Americano implements Prepare {
    @Override
    public void makeCoffee(List<Ingredients> ingredients) {
        System.out.print("Americano seçtiniz. Bu içeceğimiz ");
        ingredients.forEach(in->{
            System.out.print(in.getName() + ",");
        });
        System.out.println("malzemelerinden oluşmaktadır.");
    }
}
