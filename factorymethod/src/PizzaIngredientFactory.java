import cheese.Cheese;
import clam.Clam;
import dough.Dough;
import pepperoni.Pepperoni;
import sauce.Sauce;
import veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}