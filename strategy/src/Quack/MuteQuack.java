package Quack;
import interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior{
	public void quack() {
		System.out.println("<< Silencio >>");
	}
}
