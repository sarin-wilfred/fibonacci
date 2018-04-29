package org.telstra.fibonacci.srvc.rest.serviceimpls;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.telstra.fibonacci.srvc.rest.exceptions.FibonacciException;

/**
 * @author Sarin
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FibonacciServiceImplsTest {

	@Autowired
	private FibonacciServiceImpls fibonacciServiceImpls;

	@Test
	public void testCalculate1() throws FibonacciException {
		assertThat(fibonacciServiceImpls.calculate(11L)).isEqualTo(89);
	}

	@Test
	public void testCalculate2() throws FibonacciException {
		assertThat(fibonacciServiceImpls.calculate(13L)).isEqualTo(233);
	}

	@Test
	public void testCalculate3() throws FibonacciException {
		assertThat(fibonacciServiceImpls.calculate(0L)).isEqualTo(0);
	}

	@Test(expected = FibonacciException.class)
	public void testCalculate4() throws FibonacciException {
		fibonacciServiceImpls.calculate(-2L);
	}

}
