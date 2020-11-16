package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GiftCardTest
{
	@Test
	public void getIssuingStore()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getIssuingStore()",
		issuingStore, card.getIssuingStore());
	}
	
	@Test
	public void getBalance()
	{
		double tolerance = 0.001;
		double balance = 100.00;
		GiftCard card;
		card = new GiftCard(1337, balance);
		
		assertEquals("getBalance()", balance, card.getBalance(), tolerance);
	}
	
	@Test
	public void deduct()
	{
		double balance = 100.00;
		int issuingStore = 4242;
		double deduction = 10.00;
		GiftCard card;
		
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("deduct()", "Remaining Balance:  90.00", card.deduct(deduction));
	}
}
