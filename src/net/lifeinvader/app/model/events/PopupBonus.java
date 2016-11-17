package net.lifeinvader.app.model.events;
import net.lifeinvader.app.model.Market;


public class PopupBonus extends Event{

	private Market market;

	//Constructors 
	public PopupBonus(int reputationCoef, int privacyCoef, int viralityCoef, int reward, Market market) {
		super(reputationCoef, privacyCoef, viralityCoef, reward);
		this.market = market;
	}
	
	@Override
	public String toString() {
		return "PopupBonus [market=" + market + "]";
	}
	
	//Getter(s) and Setter(s)
	/**
	 * 
	 * @return
	 */
	public Market getMarket() {
		return market;
	}
	
	/**
	 * 
	 * @param market
	 */
	public void setMarket(Market market) {
		this.market = market;
	}

	
	
	
}

