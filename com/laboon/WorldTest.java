package com.laboon;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class WorldTest {

	@Test
	public void testToString() {
		Cell c = mock(Cell.class);
		//test case size = 1, seed = 1, percent = 100
		stub(c.getStateRep()).toReturn('.');// stub getStateRep() method in cell
		World world = new World(1, 1, 100); 
		world._world[0][0] = c;
		String returned = world.toString();
		assertEquals(returned, "  0\n0 .\n");
		
		//test case size = 2, seed = 2, percent = 0
		World world1 = new World(2, 2, 0); 
		String returned1 = world1.toString();
		assertEquals(returned1, "  01\n0 ..\n" + "1 " + "..\n");
		
		//test case size = 2, seed = 2, percent = 100;
		World world2 = new World(2, 2, 100); 
		String returned2 = world2.toString();
		assertEquals(returned2, "  01\n0 XX\n" + "1 " + "XX\n");
		
		//test case size = 2, seed = 2, percent = 50;
		World world3 = new World(2, 2, 50); 
		String returned3 = world3.toString();
		assertEquals(returned3, "  01\n0 X.\n" + "1 " + "X.\n");
		
		//test case size = 1, seed = 0, percent = 0;
		World world4 = new World(1, 0, 0); 
		String returned4 = world4.toString();
		assertEquals(returned4, "  0\n0 .\n");

		//test case size = 1, seed = 1, percent = 50;
		World world5 = new World(1, 1, 50); 
		String returned5 = world5.toString();
		assertEquals(returned5, "  0\n0 .\n");
		
		//test case size = 1, seed = 2, percent = 0;
		World world6 = new World(1, 2, 0); 
		String returned6 = world6.toString();
		assertEquals(returned6, "  0\n0 .\n");
		
		//test case size = 1, seed = 1, percent = 200;
		World world7 = new World(1, 1, 200); 
		String returned7 = world7.toString();
		assertEquals(returned7, "  0\n0 X\n");
	}
	

}


