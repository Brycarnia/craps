package pkgGame;

import java.security.SecureRandom;

public class Die {

	private int iDieValue;
	private int iNbrOfSides = 6;
	
	public Die()
	{		
		this(6);
	}
	public Die(int iNbrOfSides)
	{
		SecureRandom random = new SecureRandom();
		int iDieValue = random.nextInt(iNbrOfSides) + 1;
	}
	public int getiDieValue() {
		return iDieValue;
	}
	
}
