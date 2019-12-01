package edition1;


import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class EquationTest {

	Equation bo = new Equation();
	
	Equation bo1 = null;
	@Test
	void testAdditionOperation() {
//		fail("Not yet implemented");
		bo1 = bo.AdditionOperation();
		System.out.println(bo1);
		
	}

	@Test
	void testSubstractOperation() {
//		fail("Not yet implemented");
		bo1 = bo.SubstractOperation();
		System.out.println(bo1);
	}

	@Test
	void testBinaryOperation() {
//		fail("Not yet implemented");
		bo1 = bo.BinaryOperation();
		System.out.println(bo1);
	}

	@Test
	void testEqual() {
//		fail("Not yet implemented");
		assertTrue("相等的对象",bo.equals(bo1));
	}

	@Test
	void testToString() {
//		fail("Not yet implemented");
		bo1=bo;
		assertSame("是同一个对象",bo,bo1);
	}

}
