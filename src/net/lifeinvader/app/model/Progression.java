package net.lifeinvader.app.model;

/**
 * create an Market object TODO: Change the class description, it has to tell what Market does. 
 * @author <a href="mailto:contact@chrisv.be">Christophe Van Waesberghe (contact@chrisv.be)</a>
 * @author <a href="mailto:delfosse.da@gmail.com">Danielle Delfosse (delfosse.da@gmail.com)</a>
 *
 */
public class Progression {
    private int nbUser;
    private int reputation;
    
    //Constructors

    /**
     * Complete Progression constructor
     * @param nbUser int - Sum of the number of user who have signed up to the social network accross different market
     * @param reputation int - Sum of the reputation a social network have across different market
     */
    public Progression(int nbUser, int reputation) {
        this.nbUser = nbUser;
        this.reputation = reputation;
    }

    @Override
    public String toString() {
        return "Progression{" + "nbUser=" + nbUser + ", reputation=" + reputation + '}';
    }

    
    
    //Getters and Setters
    /**
     * Get the number of user who have signed up to the social network accross different market
     * @return int - the number of user who have signed up to the social network accross different market
     */
    public int getNbUser() {
        return nbUser;
    }

    /**
     * Set the number of user who have signed up to the social network accross different market
     * @param nbUser  int - The number of user who have signed up to the social network accross different market
     */
    public void setNbUser(int nbUser) {
        this.nbUser = nbUser;
    }

    /**
     * Get the reputation a social network have across different market
     * @return int - the reputation a social network have across different market
     */
    public int getReputation() {
        return reputation;
    }

    /**
     * Set the reputation a social network have across different market
     * @param reputation - int the reputation a social network have across different market
     */
    public void setReputation(int reputation) {
        this.reputation = reputation;
    }
}
