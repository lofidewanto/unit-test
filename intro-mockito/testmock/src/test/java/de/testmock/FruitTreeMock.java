package de.testmock;

import java.util.Collection;
import java.util.Iterator;

public class FruitTreeMock implements FruitTree {

	@Override
	public String pickFruit(Collection<Fruit> collection) {
		String title = "Pick fruit is mocked";
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
