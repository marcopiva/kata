package kata.factory.method;


import kata.factory.method.Pizza;

import org.junit.Assert;
import org.junit.Test;

public class PizzaTest {
	
	@Test
	public void instanceOfPizza() {
		Pizza pizza = createPizza();
		Assert.assertTrue(pizza instanceof Pizza);
	}

	private Pizza createPizza() {
		return new Pizza();
	}
	
	

}
