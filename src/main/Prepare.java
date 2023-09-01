import java.util.List;

public interface Prepare {
    //Bütün kahve türlerinin classlarında bulunması gereken bir metot olduğu için interface kullanıldı.

    void makeCoffee(List<Ingredients> ingredients);
}
