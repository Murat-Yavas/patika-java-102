package Account;

import address.*;
import insurance.*;
import java.util.ArrayList;

import java.time.LocalDate;


public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String profession;
    private int age;
    private LocalDate lastLogInDate;
    private ArrayList<IAddress> addresses = new ArrayList<>();
    private ArrayList<Insurance> insurances = new ArrayList<>();

    public User(String firstName, String lastName, String email, String password, String profession, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.profession = profession;
        this.age = age;
        this.lastLogInDate = LocalDate.now();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public ArrayList<IAddress> getAddresses() {
        return addresses;
    }
    public void setAddresses(ArrayList<IAddress> addresses) {
        this.addresses = addresses;
    }

    public ArrayList<Insurance> getInsurances(){
        return this.insurances;
    }
    public void setInsurances(){
        this.insurances = insurances;
    }
}
