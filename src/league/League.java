/*
 * https://github.com/Jimokunbor/League
 * 
 */
package league;

import java.util.List;

/**
 *
 * @author jimok
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Craete a class named "League" to store league name and members
    }
    private String name;    // League name
    private List members;   // List of league members
    
    // Constructor to initialize league name and members

    public League(String name, List members) {
        this.name = name;
        this.members = members;
    }
    // Getter method for league name

    public String getName() {
        return name;
    }
    // Getter method for league members

    public List getMembers() {
        return members;
    }
    // Setter method for league name

    public void setName(String name) {
        this.name = name;
    }
    // Setter method for league members

    public void setMembers(List members) {
        this.members = members;
    }
    // Method to add a member to the league
    public void addMember (String member) {
        members.add(member);
    }
    // Method to print league name and members to console
    public void printLeague() {
        System.out.println("League Name: " + name);
        System.out.println("League Members: ");
        for (String member : members) {
            System.out.println(member);
        }
        System.out.println();
    }
}
