import Fly.FlyNoWay;
import Quack.Quack;

public class ModelDuck extends Duck{
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("Sou um pato modelo");
	}
}
