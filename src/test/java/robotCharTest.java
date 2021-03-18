import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Robotics.robotChar;
/**
This is to test the robot character
 * 
 */

/**
 * @author Vinu Appukuttan
 * @version 1.0
 *
 */
public class robotCharTest {
	robotChar robotC;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		robotC = new robotChar("Passport Agent", "Submit Passport Application", "Fill Validate and Submit Application");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link Robotics.robotChar#getRobotName()}.
	 */
	@Test
	public void testGetRobotName() {
		String name = robotC.getRobotName();
		assertEquals(name,"Passport Agent");
	}

	/**
	 * Test method for {@link Robotics.robotChar#setRobotName(java.lang.String)}.
	 */
	@Test
	public void testSetRobotName() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link Robotics.robotChar#getPurpose()}.
	 */
	@Test
	public void testGetPurpose() {
		String purpose = robotC.getPurpose();
		int len = purpose.length();
		assertEquals(len,27);
	}

	/*
	 * Test method for {@link Robotics.robotChar#setPurpose(java.lang.String)}.
	 */
	@Test
	public void testSetPurpose() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link Robotics.robotChar#getAbility()}.
	 */
	@Test
	public void testGetAbility() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link Robotics.robotChar#setAbility(java.lang.String)}.
	 */
	@Test
	public void testSetAbility() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link Robotics.robotChar#robotChar(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testRobotChar() {
		assertTrue(true);
	}

}
