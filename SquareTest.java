package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25,output);
	}

}
