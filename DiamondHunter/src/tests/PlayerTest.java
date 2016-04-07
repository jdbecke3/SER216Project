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

import com.neet.DiamondHunter.Manager.Content;
import com.neet.DiamondHunter.Manager.JukeBox;
import com.neet.DiamondHunter.TileMap.TileMap;

/**
 * Class that performs unit tests on the Player class
 * @author trevorforrey
 *
 */
public class PlayerTest {
	
	private Player player;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Setting up Player test");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tearing down Player test");
	}

	@Before
	public void setUp() throws Exception {
		//player = new Player()
	}

	@After
	public void tearDown() throws Exception {
		player = null;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
