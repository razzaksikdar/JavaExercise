
import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
	@Test
	public void something() {
		assertEquals("hello", printSomething("hello"));
	}
	public String printSomething(String string)
	{
		return string;
	}
}
