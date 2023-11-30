package Account;
import address.*;


public abstract class Account {
    User user;
    public final void showUserInfo(){
        System.out.println("Account Information");
        System.out.println("First name: " + user.getFirstName());
        System.out.println("Last name: " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Age: " + user.getAge());
        System.out.println("Profession: " + user.getProfession());
    }



}
