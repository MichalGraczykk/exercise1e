package wdsr.exercise1;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import wdsr.exercise1.logic.Calculator;

public class CalculatorUtilSubtractionTest {
	private Calculator calculator;
	private CalculatorUtil calcUtil;

	@Before
	public void init() {
		calculator = Mockito.mock(Calculator.class);
		calcUtil = new CalculatorUtil(calculator);
	}

	@Test
	public void test3minus1() {
		
		when(calculator.subtract(anyInt(), anyInt())).thenReturn(2);
		String res = calcUtil.getSubstractionText(4, 2);
		assertEquals("4 - 2 = 2",res);
		verify(calculator).subtract(anyInt(), anyInt());
	}
}
