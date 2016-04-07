package tests;

import com.neet.DiamondHunter.Entity.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import com.neet.DiamondHunter.Manager.Content;
import com.neet.DiamondHunter.TileMap.TileMap;

/**
 * Class that performs unit tests on the Diamond class
 * @author trevorforrey
 * 
 */
public class DiamondTest {

	private Diamond diamond;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Setting up Diamond test");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tearing down Diamond test");
	}

	@Before
	public void setUp() throws Exception {
		//diamond = new Diamond()
	}

	@After
	public void tearDown() throws Exception {
		diamond = null;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
