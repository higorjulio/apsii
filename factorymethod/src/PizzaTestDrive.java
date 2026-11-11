public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("Queijo");
        System.out.println("Ethan pediu uma " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = nyStore.orderPizza("mariscos");
        System.out.println("Joel pediu uma " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}