package debut;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipientTest {

	@Test
	void testConstructeur() {
		//Given
		int quantite = 2;
		int capacite = 5;
		Recipient instance = new Recipient(quantite, capacite);
		//When vide car nous testons le constructeur
		//Then
		assertEquals(2, instance.getQuantite());
		assertEquals(2, instance.getCapacite());
	}
	
	void testMettreUnDans() {
		//Given
		Recipient instance = new Recipient(2, 5);
		Recipient autre = new Recipient(1, 4);
		//When
		instance.mettreUnDans(autre);
		//Then
		assertEquals(1, instance.getQuantite());
		assertEquals(2, autre.getQuantite());
		assertEquals(5, instance.getCapacite());
		assertEquals(4, autre.getQuantite());
	}
	
	@Test
	void testRemplir() {
		//Given
		Recipient instance = new Recipient(2, 5);
		Recipient autre = new Recipient(5, 6);
		//When
		instance.remplir(autre);
		//Then
		assertTrue(autre.isPlein());
		assertEquals(1, instance.getQuantite());
		assertEquals(5, instance.getQuantite());
		assertEquals(6, autre.getQuantite());
	}
	
	@Test
	void testViderDans() {
		//Given
		Recipient instance = new Recipient(2, 5);
		Recipient autre = new Recipient(5, 6);
		//When
		instance.viderDans(autre);
		//Then
		assertTrue(autre.isVide());
		assertEquals(5, autre.getQuantite());
	}

}
