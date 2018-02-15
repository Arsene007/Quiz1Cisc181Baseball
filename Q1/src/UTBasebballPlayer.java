import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UTBasebballPlayer {

	@Test
	void TestBaseball() {

		String firstname = "Babe";
		String lastname = "Ruth";
		int hits = 192;
		int aB = 540;
		int bB = 137;
		int hBP = 0;
		int runs = 158;
		int dbl = 29;

		int triple = 8;
		int hR = 60;

		BaseBallPlayer bp = new BaseBallPlayer(firstname, lastname, hits, aB, bB, hBP, runs, dbl, triple, hR);

		assertEquals( 0.355, bp.BattingAverage(), 0.01);
		
		System.out.println(bp.BattingAverage());
		assertEquals(417,bp.TotalBases());
		System.out.println(bp.SluggingPercentage());
		
		System.out.println(bp.TotalBases());
		assertEquals(0.772, bp.SluggingPercentage(), 0.01);
		
		
		
		//System.out.println(bp.BattingAverage());
		
	}

}
