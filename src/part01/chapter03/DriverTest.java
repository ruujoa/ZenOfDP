package part01.chapter03;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;

import junit.framework.TestCase;

public class DriverTest extends TestCase {
	Mockery context = new JUnit4Mockery();
	
	@Test
	public void testDriver() {
		final ICar car = context.mock(ICar.class);
		IDriver driver = new Driver();
		
		context.checking(new Expectations() {{
			oneOf(car).run();
		}});
		
		driver.drive(car);
	}
}
