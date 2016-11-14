package net.lifeinvader.app.model.events;

public class Expansion extends Event{
	private String name;
	private String desc;
	private int price;
	private int quantity;
	private int level; 
	
	public Expansion(int reputationCoef, int privacyCoef, int viralityCoef, int reward, String name, String desc, int price, int quantity, int level) {
		super(reputationCoef, privacyCoef, viralityCoef, reward);
		this.name=name;
		this.desc=desc;
		this.price=price;
		this.quantity=quantity;
		this.level=level;
	}
	
}


