package de.testmock;

import java.util.Collection;
import java.util.Iterator;

public class FruitTreeImpl implements FruitTree {

	@Override
	public String pickFruit(Collection<Fruit> collection) {
		String title = "Pick fruit is called";
		System.out.println(title.concat("..."));
		String result = title + ": ";

		for (Iterator<Fruit> iter = collection.iterator(); iter.hasNext();) {
			Fruit fruit = iter.next();
			System.out.println(fruit.getName());
			result = result.concat(fruit.getName()).concat(" ");
		}

		return result;
	}
}
