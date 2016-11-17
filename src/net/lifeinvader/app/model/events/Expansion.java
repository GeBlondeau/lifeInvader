package net.lifeinvader.app.model.events;

/**
 * create an Expansion object TODO: Change the class description, it has to tell what Market does. 
 * @author <a href="mailto:contact@chrisv.be">Christophe Van Waesberghe (contact@chrisv.be)</a>
 * @author <a href="mailto:delfosse.da@gmail.com">Danielle Delfosse (delfosse.da@gmail.com)</a>
 *
 */

public class Expansion extends Event{
	private String name;
	private String desc;
	private int price;
	private int quantity;
	private int level;
	
	//Constructors
	public Expansion(int reputationCoef, int privacyCoef, int viralityCoef, int reward, String name, String desc,
			int price, int quantity, int level) {
		super(reputationCoef, privacyCoef, viralityCoef, reward);
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.quantity = quantity;
		this.level = level;
	}

	@Override
	public String toString() {
		return "Expansion [name=" + name + ", desc=" + desc + ", price=" + price + ", quantity=" + quantity + ", level="
				+ level + "]";
	}
	
	//Getters and setters
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
	public String getDesc() {
		return desc;
	}

	/**
	 * 
	 * @param desc
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * 
	 * @return
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * 
	 * @return
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * 
	 * @param level
	 */
	public void setLevel(int level) {
		this.level = level;
	} 	
}


