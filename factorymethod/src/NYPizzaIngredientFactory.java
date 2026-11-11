import cheese.Cheese;
import cheese.ReggianoCheese;
import clam.Clam;
import clam.FreshClam;
import dough.Dough;
import dough.ThinCrustDough;
import pepperoni.Pepperoni;
import pepperoni.SlicedPepperoni;
import sauce.MarinaraSauce;
import sauce.Sauce;
import veggies.Garlic;
import veggies.Mushroom;
import veggies.Onion;
import veggies.RedPepper;
import veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper()
        };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}