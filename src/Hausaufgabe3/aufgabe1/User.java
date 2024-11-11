package Hausaufgabe3.aufgabe1;

public class User {
 protected String type;

 private int id;
 private String firstName;
 private String lastName;

 public User (int id, String firstName, String lastName) {
   this.id = id;
   this.firstName = firstName;
   this.lastName = lastName;
 }

 private void login () {
     // req : User should be able to log into the system, hence using the function the user logs into the system
 }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}




