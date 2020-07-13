import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Chef coldfoodChef = new ColdfoodChef();
        Chef meatChef = new MeatChef();
        Baker baker = new Baker();

        Chef adaptedBaker = new Adapter(baker);

        ArrayList<Chef> chefs = new ArrayList<Chef>();

        chefs.add(coldfoodChef);
        chefs.add(meatChef);
        chefs.add(adaptedBaker);

        for(Chef chef: chefs) {
            chef.cook();
        }
    }
}