import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CoffeeMaker {

    //Makinede bulunan stoklar
    static int espresso = 100;
    static int hotWater = 100;
    static int steamedMilk = 100;
    static int milkFoam = 100;
    static int hotChocolate = 100;


    //Kahvenin çeşidine göre kullanılması gereken malzemelerin adı ve miktarı
    //espresso için değişkenler.
    static int usedEspresso = 1;
    //double espresso için değişkenler.
    static int usedDoubleEspresso = 2;
    //cappuccino için değişkenler.
    static int cappuccinoEspresso = 1;
    static int cappuccinoSteamedMilk =2;
    static int cappuccinoMilkFoam = 2;

    //americano için değişkenler.
    static int americanoEspresso = 1;
    static int americanoHotWater = 4;

    //latte için değişkenler.
    static int caffelatteEspresso = 1;
    static int caffelatteSteamedMilk = 3;
    static int caffelatteMilkFoam = 1;

    //mocha için değişkenler.
    static int mochaEspresso = 1;
    static int mochaSteamedMilk = 1;
    static int mochaMilkFoam = 1;
    static int mochaHotChocolate = 2;

    //hot water için değişken.
    static int usedHotWater = 5;


    public void start() {

        int choice; //müşterinin verdiği input choice değişkenin içine atıldı.
        Scanner scanner = new Scanner(System.in);

        do {
            displayMenu();
            choice = scanner.nextInt();
            goToSelection(choice);

        } while (choice != 8);

    }

    private static void makeEspresso(){
        EspressoIng e = new EspressoIng("espressoIng",usedEspresso);
        espresso -= usedEspresso;
        Prepare espresso=new Espresso();
        List<Ingredients> ingredientsList=new ArrayList<>();

        ingredientsList.add(e);

        espresso.makeCoffee(ingredientsList);

    }
    private static void makeCappuccino() {
        Ingredients m = new MilkFoam("milkFoam", cappuccinoMilkFoam);
        Ingredients e = new EspressoIng("espressoIng",cappuccinoEspresso);
        Ingredients s = new SteamedMilk("steamedMilk",caffelatteSteamedMilk);
        milkFoam -= cappuccinoMilkFoam;
        espresso -= cappuccinoEspresso;
        steamedMilk -= cappuccinoSteamedMilk;

        Prepare cappuccino=new Cappuccino ();
        List<Ingredients> ingredientsList=new ArrayList<>();

        ingredientsList.add(e);
        ingredientsList.add(s);
        ingredientsList.add(m);

        cappuccino.makeCoffee(ingredientsList);

    }
    private static void makeCaffeLatte() {
        MilkFoam m = new MilkFoam("milkFoam", caffelatteMilkFoam);
        EspressoIng e = new EspressoIng("espressoIng",caffelatteEspresso);
        SteamedMilk s = new SteamedMilk("steamedMilk",caffelatteSteamedMilk);
        milkFoam -= caffelatteMilkFoam;
        espresso -= caffelatteEspresso;
        steamedMilk -= caffelatteSteamedMilk;


        Prepare caffeLatte=new CaffeLatte();
        List<Ingredients> ingredientsList=new ArrayList<>(); //--

        ingredientsList.add(e);
        ingredientsList.add(m);
        ingredientsList.add(s);

        caffeLatte.makeCoffee(ingredientsList);
    }
    protected static void makeMocha() {
        MilkFoam m = new MilkFoam("milkFoam", mochaMilkFoam);
        SteamedMilk s = new SteamedMilk("steamedMilk", mochaSteamedMilk);
        EspressoIng e = new EspressoIng("espressoIng",mochaEspresso);
        HotChocolate h = new HotChocolate("hotChocolate",mochaHotChocolate);
        milkFoam -= mochaMilkFoam;
        steamedMilk -= mochaSteamedMilk;
        espresso -= mochaEspresso;
        hotChocolate -= mochaHotChocolate;

        Prepare mocha=new Mocha();
        List<Ingredients> ingredientsList=new ArrayList<>();

        ingredientsList.add(m);
        ingredientsList.add(s);
        ingredientsList.add(e);
        ingredientsList.add(h);

        mocha.makeCoffee(ingredientsList);
    }
    private static void makeHotWater() {
        HotWaterIng w = new HotWaterIng("hotWaterIng",usedHotWater);
        hotWater -= usedHotWater ;

        Prepare hotWater=new HotWater();
        List<Ingredients> ingredientsList=new ArrayList<>();

        ingredientsList.add(w);

        hotWater.makeCoffee(ingredientsList);
    }
    private static void makeAmericano() {
        EspressoIng e = new EspressoIng("espressoIng",americanoEspresso);
        HotWaterIng w = new HotWaterIng("hotWaterIng",americanoHotWater);
        hotWater -= americanoHotWater;
        espresso -= americanoEspresso;

        Prepare americano=new Americano();
        List<Ingredients> ingredientsList=new ArrayList<>();

        ingredientsList.add(e);
        ingredientsList.add(w);

        americano.makeCoffee(ingredientsList);

    }
    private static void makeDoubleEspresso() {
        EspressoIng e = new EspressoIng("espressoIng",usedDoubleEspresso);
        espresso -= usedDoubleEspresso;

        Prepare doubleEspresso=new DoubleEspresso();
        List<Ingredients> ingredientsList=new ArrayList<>();

        ingredientsList.add(e);

        doubleEspresso.makeCoffee(ingredientsList);

    }


    private void displayMenu(){

        System.out.println("-----MENU----");
        System.out.println("1. Espresso  (20 ₺)");
        System.out.println("2. Double Espresso  (29 ₺)");
        System.out.println("3. Cappuccino (27 ₺)");
        System.out.println("4. Caffe Latte (27 ₺)");
        System.out.println("5. Mocha (32 ₺)");
        System.out.println("6. Americano (25 ₺)");
        System.out.println("7. Hot Water (5 ₺)\n");
        System.out.println("8. ÇIKIŞ ");

        System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz.");
    }

    public void goToSelection(int choice){
        switch (choice) { //switch-case kısmında, makinenin içindeki stok miktarı ve istenen kahvenin malzemelerinin yeterliği karşılaştırılıyor.
            case 1:
                if( espresso >= usedEspresso) {
                    makeEspresso();

                }
                else
                    System.out.println("Malzeme yetersiz.");
                break;
            case 2:
                if(espresso>=usedDoubleEspresso){
                    makeDoubleEspresso();
                }
                else
                    System.out.println("Malzeme yetersiz.");
                break;

            case 3:
                if(espresso>=americanoEspresso && hotWater>=americanoHotWater ){
                    makeCappuccino();
                }
                else
                    System.out.println("Malzeme yetersiz.");
                break;

            case 4:
                if(espresso>=cappuccinoEspresso && steamedMilk>=cappuccinoSteamedMilk && milkFoam>=cappuccinoMilkFoam ){
                    makeCaffeLatte();
                }
                else
                    System.out.println("Malzeme yetersiz.");
                break;

            case 5:
                if(espresso>=caffelatteEspresso && steamedMilk>=caffelatteSteamedMilk && milkFoam>=caffelatteMilkFoam ){
                    makeMocha();
                }
                else
                    System.out.println("Malzeme yetersiz.");
                break;
            case 6:
                if(espresso>=mochaEspresso && steamedMilk>=mochaSteamedMilk && milkFoam>=mochaMilkFoam && hotChocolate>=mochaHotChocolate ) {
                    makeAmericano();
                }
                else
                    System.out.println("Malzeme yetersiz.");
                break;
            case 7:
                if(hotWater>=usedHotWater){
                    makeHotWater();
                }
                else
                    System.out.println("Malzeme yetersiz.");
                break;
            case 8:
                break;

            default:
                System.out.println("Geçersiz seçim!");
                break;
        }
    }
    public int getEspressoResource(){
        return espresso;
    }

    public int getSteamedMilkResource(){
        return steamedMilk;
    }

    public int getHotWaterResource(){
        return hotWater;
    }

    public int getMilkFoamResource(){
        return milkFoam;
    }

    public int getHotChocolateResource(){
        return hotChocolate;
    }
}
