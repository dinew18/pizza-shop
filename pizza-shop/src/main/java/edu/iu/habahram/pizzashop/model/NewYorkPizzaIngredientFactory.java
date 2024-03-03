package edu.iu.habahram.pizzashop.model;

public class NewYorkPizzaIngredientFactory
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new Reggiano();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Mushrooms(),
		                      new Onions(),
		                      new RedPeppers() };
		return veggies;
	}

	public Pepperoni createPepperoni() { return new SlicedPepperoni();}

	public Clams createClam() {
		return new FreshClams();
	}
}
