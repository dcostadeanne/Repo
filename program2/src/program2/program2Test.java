package program2;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment.program1;

public class program2Test {
	program2 p2=new program2();

	@Test
	public void testsum() {
		int res=p2.diff(9,7);
		assertEquals(2,res);
	}

}
