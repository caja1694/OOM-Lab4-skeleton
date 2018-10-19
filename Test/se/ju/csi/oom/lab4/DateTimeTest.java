package se.ju.csi.oom.lab4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTimeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void ToStringTest() {
		DateTime testDateTime = new DateTime(2018, 10, 19, 10, 15, 30);
		assertEquals(testDateTime.toString(), "2018-10-19 10:15:30");
	}
	
	@Test
	public void dateTimeStringTest() {
		DateTime testDateTime = new DateTime("2018-10-19 10:15:30");
		DateTime compareDateTime = new DateTime(2018, 10, 19, 10, 15, 30);
		assertEquals(testDateTime.toString(), compareDateTime.toString());
	}

}
