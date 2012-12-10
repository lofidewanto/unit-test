package de.testmock;

import static org.mockito.Matchers.anyCollectionOf;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FruitTreeKillerDynamicTest {

	// We mock the Mango Tree
	@Mock
	private FruitTree mangoTree;

	// We mock the Coconut Tree
	@Mock
	private FruitTree coconutTree;

	// We test the behaviour of FruitTreeKiller
	// We need a setter method setMangoTree and
	// setCoconutTree in FruitTreeKiller
	// The name of the mock objects must be correct to be injected smoothly!
	@InjectMocks
	private FruitTreeKiller killer;

	@Test
	public final void testKillFruitTreeDynamic() {
		System.out.println("*** Dynamic ***");

		// Stubbing
		when(mangoTree.pickFruit(anyCollectionOf(Fruit.class))).thenReturn(
				"Pick fruit is mocked by mockito: Mango1 Mango2 Mango3 ");
		// Run the method to be tested
		killer.killMangoTree();
		verify(mangoTree, times(1)).pickFruit(anyCollectionOf(Fruit.class));

		// Stubbing
		when(coconutTree.pickFruit(anyCollectionOf(Fruit.class))).thenReturn(
				"Pick fruit is mocked by mockito: Coconut1 Coconut2 ");
		// Run the method to be tested
		killer.killCoconutTree();
		verify(coconutTree, times(1)).pickFruit(anyCollectionOf(Fruit.class));
	}
}
