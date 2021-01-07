package groovydemo01

import static org.junit.Assert.*

import org.junit.Test

class MeterTest {

	@Test
	public void test() {
		Meter meter=new Meter(2.5)
		
		assertEquals(2,meter.meter)
	}

	@Test
	public void test2() {
		Meter meter=new Meter(2.5)
		assert meter.cm==50.0
	}
}
