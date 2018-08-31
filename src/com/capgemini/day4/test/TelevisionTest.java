package com.capgemini.day4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TelevisionTest {
	Television television;
  
	@BeforeEach
	void setup()
     {
	television=new Television(0,1,false);
	}
	void testStateTest()
	{
		assertEquals("Yes on",Television.stateTest("on"));
		assertEquals("Yes off",Television.stateTest("off"));
	}
	
	@Test
	void testVolumeTest() {
		assertEquals(1,television.increaseVolume());
		assertEquals(2,television.increaseVolume());
		assertEquals(3,television.increaseVolume());
		assertEquals(4,television.increaseVolume());
		assertEquals(5,television.increaseVolume());
		assertEquals(4,television.decreaseVolume());
		assertEquals(3,television.decreaseVolume());
		assertEquals(2,television.decreaseVolume());
		assertEquals(1,television.decreaseVolume());
		assertEquals(0,television.decreaseVolume());
		
	}
	@Test
	void testChangeChannel()
	{
		assertEquals(3,Television.changeChannel(3));
	}
	void testpower()
	{
		assertEquals("on", Television.checkPower(true));
	}
	@Test
	void testCurrentvolume()
	{
		assertEquals(0,television.currentVolume());
	}

}
