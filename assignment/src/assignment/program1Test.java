package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class program1Test {
	program1 p1=new program1();

	@Test
	public void testsum() {
		int res=p1.sum(8,7);
		assertEquals(15,res);
	}

}
