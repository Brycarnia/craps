package pkgGame;

import  pkgEnums.*;

public class Roll {

	private Die[] dice;
	private int iRollScore;
	private eRollType eRollType;
	
	public Roll()
	{
		dice = new Die[2];
		dice[0] = new Die();
		dice[1] = new Die();
		
		ScoreRoll();
	}
	
	
	private int ScoreRoll()
	{
		int iScore = dice[0].getiDieValue() + dice[1].getiDieValue();
		seteRollType();
		return iScore;		
	}
	
	private void seteRollType()
	{
		
		switch (ScoreRoll())
		{
		case 4:			
			this.eRollType = (dice[0].getiDieValue() == dice[1].getiDieValue()) ? 
					eRollType.HardFour : eRollType.EasyFour;	
			break;
		case 6:			
			this.eRollType = (dice[0].getiDieValue() == dice[1].getiDieValue()) ? 
					eRollType.HardSix : eRollType.EasySix;	
			break;
		case 8:			
			this.eRollType = (dice[0].getiDieValue() == dice[1].getiDieValue()) ? 
					eRollType.HardEight : eRollType.EasyEight;	
			break;
		case 10:			
			this.eRollType = (dice[0].getiDieValue() == dice[1].getiDieValue()) ? 
					eRollType.HardTen : eRollType.EasyTen;	
			break;	
		case 7:
			this.eRollType = eRollType.Seven;
			break;
		case 11:
			this.eRollType = eRollType.YoEleven;
			break;
		case 2:
		case 3:
		case 12:
			this.eRollType = eRollType.AnyCraps;
			break;
		}
			
	}


	public eRollType geteRollType() {
		return eRollType;
	}


	public int getiRollScore() {
		return iRollScore;
	}
	
	
}
