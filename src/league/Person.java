/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package league;

/**
 *
 * @author jimok
 */
public class Person {
    // Create a class named "Person" to store person's info
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    
    // Constructor to initialize person's information

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    // Getter method for person's id

    public int getId() {
        return id;
    }
    // Getter method for person's first name

    public String getFirstName() {
        return firstName;
    }
    // Getter method for person's last name

    public String getLastName() {
        return lastName;
    }
    // Getter method for person's email

    public String getEmail() {
        return email;
    }
    // Setter method for person's id

    public void setId(int id) {
        this.id = id;
    }
    // Setter method for person's first name

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // Setter method for person's last name

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // Setter method for person's email

    public void setEmail(String email) {
        this.email = email;
    }
    
}
