package core;

import org.testng.annotations.*;

import static org.hamcrest.MatcherAssert.*;

import static org.hamcrest.Matchers.*;


public class DivideTest {


	@Test
	public void divide_test_2_param() {

		assertThat(Calculator.divide(2, 2), allOf(notNullValue(),
										 instanceOf(double.class), 
										 equalTo(1.0), 
										 lessThan(100000.0)));
	}

	@Test
	public void divide_test_3_param() {

		assertThat(Calculator.divide(16, 2, 2), allOf(notNullValue(),
				 							instanceOf(double.class), 
				 							equalTo(4.0), 
				 							lessThan(100000.0)));
	}

	@Test
	public void divide_test_4_param() {

		assertThat(Calculator.divide(1009, 50, 25, 4), closeTo(0.2, 0.09));
	}

}