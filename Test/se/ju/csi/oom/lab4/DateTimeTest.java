package se.ju.csi.oom.lab4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTimeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void toStringTest() {
		DateTime testDateTime = new DateTime(1994, 01, 29, 10, 10, 10);
		assertEquals(testDateTime.toString(), "1994-01-29 10:10");
	}
	@Test
	public void dateTimeFromStringTest(){
		DateTime testDateTime = new DateTime("1994-01-29 10:10:10");
		DateTime compareDateTime = new DateTime(1994, 01, 29, 10, 10, 10);
		assertEquals(testDateTime.toString(), compareDateTime.toString());
		
	}

}
