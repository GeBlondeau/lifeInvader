package net.lifeinvader.app.model.events;

public abstract class Event {
	private int reputationCoef=0;
	private int privacyCoef=0;
	private int viralityCoef=0;
	private int reward=0;
	
	public Event(int reputationCoef, int privacyCoef, int viralityCoef, int reward){
		this.reputationCoef=reputationCoef;
		this.privacyCoef=privacyCoef;
		this.viralityCoef=viralityCoef;
		this.reward=reward;	
	}
	
	public String toString(){
		return "Event["+this.reputationCoef+", "+this.privacyCoef+" ,"+this.viralityCoef+","+this.reward+" ]";
	}
}