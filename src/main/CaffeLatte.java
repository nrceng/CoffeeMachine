import java.util.List;

public class CaffeLatte implements Prepare {
    @Override
    public void makeCoffee(List<Ingredients> ingredients) {
        System.out.print("Caffe Latte seçtiniz. Bu içeceğimiz ");
        ingredients.forEach(in->{
            System.out.print(in.getName() + ",");
        });
        System.out.println("malzemelerinden oluşmaktadır.");

    }
}
