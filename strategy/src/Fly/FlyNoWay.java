package Fly;
import interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior{
	public void fly() {
		System.out.println("Nao consigo voar");
	}
}
