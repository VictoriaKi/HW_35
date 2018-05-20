package core;

import org.testng.annotations.*;

import static org.hamcrest.MatcherAssert.*;

import static org.hamcrest.Matchers.*;


public class SubtractTest {


	@Test
	public void subtract_test_2_param() {

		assertThat(Calculator.subtract(2, 2), allOf(notNullValue(),
										 instanceOf(double.class), 
										 equalTo(0.0), 
										 lessThan(100000.0)));
	}

	@Test
	public void subtract_test_3_param() {

		assertThat(Calculator.subtract(2, 2, 2), allOf(notNullValue(),
				 							instanceOf(double.class), 
				 							equalTo(-2.0), 
				 							lessThan(100000.0)));
	}

	@Test
	public void subtract_test_4_param() {

		assertThat(Calculator.subtract(2, 2, 2, 2), equalTo(-4.0));
	}

}