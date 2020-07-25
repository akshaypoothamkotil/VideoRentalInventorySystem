package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Store.VideoStore;

class VideoStoreTest {
	VideoStore vs1=new VideoStore();
	@Test
	void test00() {
		
		assertEquals(true,vs1.addVideo("Legend"));
		assertEquals(true,vs1.checkOut("Legend"));
		assertEquals(false,vs1.checkOut("Legend"));
		
		assertEquals(true,vs1.returnVideo("Legend"));
		assertEquals(true,vs1.checkOut("Legend"));
		assertEquals(false,vs1.checkOut("Legend"));
		
		assertEquals(true,vs1.addVideo("Pewds"));
		assertEquals(true,vs1.addVideo("Matrix"));
		assertEquals(true,vs1.addVideo("Platform"));
		assertEquals(true,vs1.addVideo("IDk"));

		assertEquals(true,vs1.reciveRating("Legend", 5));
		assertEquals(false,vs1.reciveRating("Legend", 9));
		assertEquals(true,vs1.reciveRating("Legend", 3));
		
		
		
		vs1.listInventory();
	}
	
	
}
