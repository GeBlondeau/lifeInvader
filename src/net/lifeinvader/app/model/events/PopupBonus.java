package net.lifeinvader.app.model.events;
import src.net.lifeinvader.app.model.Market;


public class PopupBonus extends Event{

	Market market;

	public PopupBonus(Market market,int reputationCoef, int privacyCoef, int viralityCoef, int reward) {
		super(reputationCoef, privacyCoef, viralityCoef, reward);
		
		this.market=market;
	}
}

