package pkgGame;

import java.util.LinkedList;

import pkgEnums.eRollType;
import pkgEnums.eRoundResult;

public class Round {

	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	private eRoundResult eRoundResult;
	
	public Round() {
		ExecuteRoll();

	}

	public boolean ExecuteRoll() {
		Roll r = new Roll();
		rolls.add(r);
		return ScoreRound();
	}

	public eRoundResult geteRoundResult() {
		return eRoundResult;
	}

	public boolean ScoreRound() {
		

		if ((rolls.getFirst().geteRollType() == eRollType.Seven)
				|| rolls.getFirst().geteRollType() == eRollType.YoEleven) {
			eRoundResult = eRoundResult.Natural;
		}

		if (rolls.getFirst().geteRollType() == eRollType.AnyCraps) {
			eRoundResult = eRoundResult.Craps;
		}

		if (rolls.size() > 1)
		{
			if (rolls.getFirst().getiRollScore() == rolls.getLast().getiRollScore()) {
				eRoundResult = eRoundResult.Point;
			}
			else if (rolls.getLast().getiRollScore() == 7)
			{
				eRoundResult = eRoundResult.SevenOut;
			}
		}

		return eRoundResult == null;

	}

}
