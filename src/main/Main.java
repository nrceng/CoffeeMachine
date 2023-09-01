// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
/** @author nurca
 *
 *******Bilgi güvenliği ve uygulama güvenliği ile ilgili yorumum*********
 * Bu uygulama bir konsol uygulaması olduğu için uygulama her client için ayrı yarı yüklenmelidir.
 * Uygulamayı kullananlar uygulama kodlarını decompile ederek kodları manipüle edebilirler.
 * Merkezi olmadığı için herhangi bir kod değişikliği clientlara anında yansıtılamaz
 *
 * github: https://github.com/nrceng/CoffeeMachine
 **/

public class Main {
    public static void main(String[] args) {
        CoffeeMaker cm = new CoffeeMaker(); //Coffemaker objesi üretildi ve start metotu çağırılıp uygulama başlatıldı.
        cm.start();

    }
}