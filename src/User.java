public class User {

    // declaring attributes of the User model
    String username;
    String lastName;
    String dateOfBirth;
    String firstName;

    public User(String username, String firstName, String lastName, String dateOfBirth){
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

    public String getdateOfBirth(){
        return dateOfBirth;
    }

    public void setdateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



}