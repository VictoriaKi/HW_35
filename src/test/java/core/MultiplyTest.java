package core;

import org.testng.annotations.*;

import static org.hamcrest.MatcherAssert.*;

import static org.hamcrest.Matchers.*;


public class MultiplyTest {


	@Test
	public void multiply_test_2_param() {

		assertThat(Calculator.multiply(2, 2), allOf(notNullValue(),
										 instanceOf(double.class), 
										 equalTo(4.0), 
										 lessThan(100000.0)));
	}

	@Test
	public void multiply_test_3_param() {

		assertThat(Calculator.multiply(2, 2, 2), allOf(notNullValue(),
				 							instanceOf(double.class), 
				 							equalTo(8.0), 
				 							lessThan(100000.0)));
	}

	@Test
	public void multiply_test_4_param() {

		assertThat(Calculator.multiply(1, 2, 1, 2), equalTo(4.0));
	}

}