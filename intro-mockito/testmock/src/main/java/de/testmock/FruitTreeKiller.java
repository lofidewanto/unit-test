package de.testmock;

import java.util.ArrayList;
import java.util.Collection;

public class FruitTreeKiller {

	private FruitTree mangoTree = new FruitTreeImpl();

	private FruitTree coconutTree = new FruitTreeImpl();

	private FruitImpl mango1;

	private FruitImpl mango2;

	private FruitImpl mango3;

	private FruitImpl coconut1;

	private FruitImpl coconut2;

	public FruitTreeKiller() {
		createMangos();
		createCoconuts();
	}

	private void createMangos() {
		mango1 = new FruitImpl();
		mango1.setName("Mango1");
		mango2 = new FruitImpl();
		mango2.setName("Mango2");
		mango3 = new FruitImpl();
		mango3.setName("Mango3");
	}

	private void createCoconuts() {
		coconut1 = new FruitImpl();
		coconut1.setName("Coconut1");
		coconut2 = new FruitImpl();
		coconut2.setName("Coconut2");
	}

	public void killMangoTree() {
		Collection<Fruit> mangos = new ArrayList<Fruit>();
		mangos.add(mango1);
		mangos.add(mango2);
		mangos.add(mango3);

		// We kill all the mango trees... ;-)
		String result = mangoTree.pickFruit(mangos);
		System.out.println(result.trim());
	}

	public void killCoconutTree() {
		Collection<Fruit> coconuts = new ArrayList<Fruit>();
		coconuts.add(coconut1);
		coconuts.add(coconut2);

		// We kill all the coconut trees... ;-)
		String result = coconutTree.pickFruit(coconuts);
		System.out.println(result.trim());
	}

	public void setMangoTree(FruitTree mangoTree) {
		this.mangoTree = mangoTree;
	}

	public void setCoconutTree(FruitTree coconutTree) {
		this.coconutTree = coconutTree;
	}
}
