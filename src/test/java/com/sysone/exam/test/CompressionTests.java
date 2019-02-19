package com.sysone.exam.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sysone.exam.App;
import com.sysone.exam.service.StringCompressionService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { App.class })
public class CompressionTests {
	
	@Autowired
	StringCompressionService stringCompressionService;
	
	@Test
	public void testCompression() {
		
		assertEquals(stringCompressionService.compress(""), "");
		
		assertEquals(stringCompressionService.compress("aaaBBB"), "3A3B");
		
		assertEquals(stringCompressionService.compress("AaCc"), "2A2C");
		
		assertEquals(stringCompressionService.compress("aaAABNNcCAa"), "4A1B2N2C2A");
		
	}
}
