package net.lifeinvader.app.model;

/**
 * create an Market object TODO: Change the class description, it has to tell what Market does. 
 * @author <a href="mailto:contact@chrisv.be">Christophe Van Waesberghe (contact@chrisv.be)</a>
 * @author <a href="mailto:delfosse.da@gmail.com">Danielle Delfosse (delfosse.da@gmail.com)</a>
 *
 */
public class Market {

    private String name = "N/A";
    private String code = "N/A";
    
    private int popNoWeb = 0;
    private int popWeb = 0;
    
    //Constructors
    
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

    /**
     * Return the Market in a String form (Market{name="name", code="code", popNoWeb="popNoWeb", popWeb="popWeb", nbInscrit="nbInscrit'})
     * @return test
     */
    @Override
    public String toString() {
        return "Market{" + "name=" + name + ", code=" + code + ", popNoWeb=" + popNoWeb + ", popWeb=" + popWeb + "}";
    } 
    
    //Getters and setters
    /**
     * Get the Market name
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the Market name
     * @param name String - Market name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the Market code
     * @return String - Market code
     */
    public String getCode() {
        return code;
    }

    /**
     * Set the Market code (TODO: Code convention to be defined)
     * @param code String - Market code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Get the Market population without Internet
     * @return int - Market population without internet
     */
    public int getPopNoWeb() {
        return popNoWeb;
    }

    /**
     * Set the Market population without Internet
     * @param popNoWeb int - Market population without internet
     */
    public void setPopNoWeb(int popNoWeb) {
        this.popNoWeb = popNoWeb;
    }

     /**
     * Get the Market population with Internet
     * @return int - Market population with Internet
     */
    public int getPopWeb() {
        return popWeb;
    }

    /**
     * Set the Market population with Internet
     * @param popWeb int - Market population with Internet
     */
    public void setPopWeb(int popWeb) {
        this.popWeb = popWeb;
    }
        	
}
