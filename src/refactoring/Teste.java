package refactoring;

import junit.framework.TestCase;

public class Teste extends TestCase {

	public void testarStatment() {
		Movie m1 = new Movie("Harry Potter", Movie.REGULAR);
		Movie m2 = new Movie("Avatar", Movie.NEW_RELEASE);
		Movie m3 = new Movie("Into the Wild", Movie.CHILDRENS);
		
		Rental r1 = new Rental(m1, 10);
		Rental r2 = new Rental(m2, 4);
		Rental r3 = new Rental(m3, 9);
		
		Customer c1 = new Customer("Amanda");
		
		c1.addRental(r1);
		c1.addRental(r2);
		c1.addRental(r3);
		
		assertEquals("Rental Record for Amanda\n\tHarry Potter\t14.0\n\tAvatar\t12.0\n\tInto the Wild\t10.5\nAmount owed is 36.5\nYou earned 4 frequent renter points", c1.statement());
	}
}
