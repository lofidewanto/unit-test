package de.testmock;

import org.junit.Test;

public class FruitTreeKillerTest {

	@Test
	public final void testKillFruitTreeStatic() {
		// We run the FruitTreeKiller
		FruitTreeKiller killer = new FruitTreeKiller();
		killer.killMangoTree();
		killer.killCoconutTree();
	}
}
