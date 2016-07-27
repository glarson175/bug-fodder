import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SieveTester 
{
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testValidArgument() {
		Sieve sieveTest = new Sieve();
		String[] args = {"45"};
		int _max = sieveTest.calculateMax(args);
		assertEquals(Integer.parseInt(args[0]), _max);
		
	}
	
	@Test
	public void testNoArgumentAdded() 
	{
		thrown.expect(IllegalArgumentException.class);
		throw new IllegalArgumentException();
	}

}

