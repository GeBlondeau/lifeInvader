package net.lifeinvader.app.model;

/**
 * create an Market object TODO: Change the class description, it has to tell what Market does. 
 * @author <a href="mailto:contact@chrisv.be">Christophe Van Waesberghe (contact@chrisv.be)</a>
 * @author <a href="mailto:delfosse.da@gmail.com">Danielle Delfosse (delfosse.da@gmail.com)</a>
 *
 */

public class SocialNetwork {
	
	private String name;
	private int wallet;
	private int virality;
	private int stockValue;
	
	// Constructors 
	/**
	 * Complete SocialNetwork constructor 
	 * @param name - what the user wants to call its socila network
	 * @param wallet - what the user has as credit to buy actions 
	 * @param virality - coefficient of your social network
	 * @param stockValue 
	 */

	public SocialNetwork(String name, int wallet, int virality, int stockValue) {
		super();
		this.name = name;
		this.wallet = wallet;
		this.virality = virality;
		this.stockValue = stockValue;
	}

	// Getters and setters
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getWallet() {
		return wallet;
	}

	/**
	 * 
	 * @param wallet
	 */
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getVirality() {
		return virality;
	}
	
	/**
	 * 
	 * @param virality
	 */
	public void setVirality(int virality) {
		this.virality = virality;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getStockValue() {
		return stockValue;
	}
	
	/**
	 * 
	 * @param stockValue
	 */
	public void setStockValue(int stockValue) {
		this.stockValue = stockValue;
	}

	@Override
	public String toString() {
		return "SocialNetwork [name=" + name + ", wallet=" + wallet + ", virality=" + virality + ", stockValue="
				+ stockValue + "]";
	}
	
}
