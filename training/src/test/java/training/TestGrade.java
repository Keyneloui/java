package training;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGrade {

	@Test
	public void testA() {
		char b=Grade.CalcGrade(87);
		assertEquals('A',b);
	}
	@Test
	public void testB() {
		char b=Grade.CalcGrade(76);
		assertEquals('B',b);
	}
	@Test
	public void testC() {
		char b=Grade.CalcGrade(54);
		assertEquals('C',b);
	}
	@Test
	public void testF() {
		char b=Grade.CalcGrade(45);
		assertEquals('F',b);
	}

}
