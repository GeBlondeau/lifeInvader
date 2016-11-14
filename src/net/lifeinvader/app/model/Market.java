package net.lifeinvader.app.model;

/**
 * create an Market object TODO: Change the class description, it has to tell what Market does. 
 * @author <a href="mailto:contact@chrisv.be">Christophe Van Waesberghe (contact@chrisv.be)</a>
 * @author <a href="mailto:delfosse.da@gmail.com">Danielle Delfosse (delfosse.da@gmail.com)</a>
 *
 */
public class Market {

	String name = "N/A";
	String code = "N/A";
	
	int popNoWeb = 0;
	int popWeb = 0;
	
	int nbInscrit = 0;
	
	/**
	 * Complete Market constructor
	 * @param name String - Market name
	 * @param code String - Market code (Code rules to be defined)
	 * @param popNoWeb int - Market population without Internet (in million)
	 * @param popWeb int - Market population with Internet (in million)
	 */
	public Market(String name, String code, int popNoWeb, int popWeb){
		this.name=name;
		this.code=code;
		this.popNoWeb=popNoWeb;
		this.popWeb=popWeb;
		
	}
	
	
		
}
