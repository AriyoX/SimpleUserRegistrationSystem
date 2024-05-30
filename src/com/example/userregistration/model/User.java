package com.example.userregistration.model;

import java.time.LocalDate;
import java.util.Objects;

public class User {

    // declaring attributes of the User model
    private String username;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public User(String username, String firstName, String lastName, LocalDate dateOfBirth){
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    // define the setters and getters
    public String getusername(){
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfname(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    
    public void getlastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getdateOfBirth(){
        return dateOfBirth;
    }

    public void setdateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // overriding toString method
    @Override
    public String toString(){
        return "Username: " + username + ". First Name: " + firstName + ". Last Name: " + lastName + ". Date Of Birth: " + dateOfBirth;
    }

    // overriding the equals method so that it returns the right boolean value when two similar objects of type User are compared
    @Override
    public boolean equals(Object o){
        // if the object passed is the same as the current one, return true since they are equal
        if (o == this){
            return true;
        }

        // if object passed isn't an instance of User, it is automatically not a similar object thus returning false
        if (o == null || !(o instanceof User)){
            return false;
        }

        // cast object o to the User type
        User user = (User) o;

        // equality checks
        boolean usernameEquals = this.username.equals(user.username);
        boolean firstNameEquals = (this.firstName == null && user.firstName == null ||
                                    this.firstName != null && this.firstName.equals(user.firstName));
        boolean lastNameEquals = (this.lastName == null && user.lastName == null || 
                                    this.lastName != null && this.lastName.equals(user.lastName));
        boolean dateOfBirthEquals = (this.dateOfBirth == null && user.dateOfBirth == null || 
                                    this.dateOfBirth != null && this.dateOfBirth.equals(user.dateOfBirth));

        // return true if all the equality checks are true
        return (usernameEquals &&
                firstNameEquals && 
                lastNameEquals && 
                dateOfBirthEquals);
    }

    // to correctly identify an object by returning a consistent hash code for the object
    @Override
    public int hashCode(){
        return Objects.hash(username, firstName, lastName, dateOfBirth);
    }



}