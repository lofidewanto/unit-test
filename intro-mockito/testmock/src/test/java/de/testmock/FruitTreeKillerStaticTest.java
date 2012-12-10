package de.testmock;

import org.junit.Test;

public class FruitTreeKillerStaticTest {

	@Test
	public final void testKillFruitTreeStatic() {
		System.out.println("*** Static ***");

		// We test the behaviour of FruitTreeKiller
		FruitTreeKiller killer = new FruitTreeKiller();

		// We mock the Mango Tree
		FruitTree mangoTreeMock = new FruitTreeMock();
		killer.setMangoTree(mangoTreeMock);
		// Run the method to be tested
		killer.killMangoTree();

		// We mock the Coconut Tree
		FruitTree coconutTreeMock = new FruitTreeMock();
		killer.setCoconutTree(coconutTreeMock);
		// Run the method to be tested
		killer.killCoconutTree();
	}
}
