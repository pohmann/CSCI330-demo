package bucket.test;

import bucket.NumberBucket;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BucketTest {
	NumberBucket testObj;
	NumberBucket emptyObj;

	@Before
	public void setUp() throws Exception {
		emptyObj = new NumberBucket();
		testObj = new NumberBucket();
		testObj.addNumber(15);
		testObj.addNumber(10);
	}

	@Test
	public void testGetSize() {
		assertEquals("inital size empty", 0, emptyObj.getSize());
		assertEquals("initial size of test", 2, testObj.getSize());
	}

	@Test
	public void testAverage() {
		int first = 10;
		int second = 5;
		emptyObj.addNumber(first);
		emptyObj.addNumber(second);
		assertEquals("mean", (first+second)/2.0, emptyObj.average(), 0.0001);
	}

	@Test
	public void testAdd() {
		int origSize = testObj.getSize();
		testObj.addNumber(-5);
		assertEquals("new size for test", origSize+1, testObj.getSize());

		origSize = emptyObj.getSize();
		emptyObj.addNumber(15);
		emptyObj.addNumber(12);
		assertEquals("new size for empty", origSize+2, emptyObj.getSize());
	}
}
