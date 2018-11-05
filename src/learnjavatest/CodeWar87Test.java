package learnjavatest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import learnjava.*;

public class CodeWar87Test {
	@Test
	public void testSumMid() {
		assertEquals(16, CodeWar87.sumMid(new int[] { 6, 2, 1, 8, 10 }));
		assertEquals(0, CodeWar87.sumMid(null));
		assertEquals(0, CodeWar87.sumMid(new int[] {}));
		assertEquals(0, CodeWar87.sumMid(new int[] { 6 }));
		assertEquals(0, CodeWar87.sumMid(new int[] { 6, 4 }));
	}

	@Test
	public void testGetXO() {
		assertEquals(true, CodeWar87.getXO("xxxooo"));
		assertEquals(true, CodeWar87.getXO("xxxXooOo"));
		assertEquals(false, CodeWar87.getXO("xxx23424esdsfvxXXOOooo"));
		assertEquals(false, CodeWar87.getXO("xXxxoewrcoOoo"));
		assertEquals(false, CodeWar87.getXO("XxxxooO"));
		assertEquals(true, CodeWar87.getXO("zssddd"));
		assertEquals(false, CodeWar87.getXO("Xxxxertr34"));
	}

	@Test
	public void testFindOutliers() {
		int[] exampleTest1 = { 2, 6, 8, -10, 3 };
		int[] exampleTest2 = { 206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781 };
		int[] exampleTest3 = { Integer.MAX_VALUE, 0, 1 };
		assertEquals(3, CodeWar87.findOutlier(exampleTest1));
		assertEquals(206847684, CodeWar87.findOutlier(exampleTest2));
		assertEquals(0, CodeWar87.findOutlier(exampleTest3));
	}

	@Test
	public void testDigitize() {
		assertArrayEquals(new int[] { 1, 3, 2, 5, 3 }, CodeWar87.digitize(35231));

		assertArrayEquals(new int[] { 0, 1, 7, 3, 2, 8, 1, 1, 8, 2 }, CodeWar87.digitize(2811823710l));

	}

	@Test
	public void BasicTests() {
		System.out.println("****** Basic Tests ******");
		assertEquals(3, CodeWar87.persistence(39));
		assertEquals(0, CodeWar87.persistence(4));
		assertEquals(2, CodeWar87.persistence(25));
		assertEquals(4, CodeWar87.persistence(999));
	}
}