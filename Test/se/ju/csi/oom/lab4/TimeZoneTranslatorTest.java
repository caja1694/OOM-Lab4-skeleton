package se.ju.csi.oom.lab4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

public class TimeZoneTranslatorTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testShiftTimeZone() {
		DateTime Bilibompa = new DateTime(2018, 10, 07, 18, 0, 0);
		Bilibompa = TimeZoneTranslator.shiftTimeZone(Bilibompa, 1, 3);
		assertEquals(Bilibompa.toString(), "2018-10-07 20:00:00");
		
		DateTime test2 = new DateTime(2015, 12, 31, 21, 0, 0);
		test2 = TimeZoneTranslator.shiftTimeZone(test2, -8, 1);
		assertEquals(test2.toString(), "2016-01-01 06:00:00");
		
	}

	@Test
	public void testShiftEventTimeZone() {
		
		Person Connor = new Person("Connor");
		Person Khabib = new Person("Khabib");
		Place Narnia = new Place("Narnia", 2451.02 , 5674.03 , 54662.03);
		DateTime startTime = new DateTime(2018, 10, 06, 20, 0, 0);
		DateTime endTime = new DateTime(2018, 10, 06, 23, 0, 0);
		
		DateTime HCStartTime = new DateTime(2018, 10, 07, 03, 0, 0);
		DateTime HCEndTime = new DateTime(2018, 10, 07, 06, 0, 0);  
		
		Event UFCfight = new Event("UFC 229",
				startTime,
				endTime,
				new HashSet<>(Arrays.asList(Connor, Khabib)),
				Narnia
				);
		UFCfight = TimeZoneTranslator.shiftEventTimeZone(UFCfight, TimeZone.US_CENTRAL, TimeZone.CENTRAL_EUROPEAN_TIME);
		
		Event compareEvent = new Event("UFC 229", HCStartTime, HCEndTime, new HashSet<>(Arrays.asList(Connor, Khabib)), Narnia);
		
		assertEquals(UFCfight.toString(), compareEvent.toString());
		
		
		
	}

}


