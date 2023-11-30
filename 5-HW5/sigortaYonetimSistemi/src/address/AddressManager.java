package address;

import java.util.ArrayList;
import java.util.Scanner;


public class AddressManager {


    public static void addAddress(ArrayList<IAddress> addresses){
        int preferredNumber;
        System.out.println("""
                1- Add a new Home Address
                2- Add a new Business Address
                Enter number:\s""");

        Scanner input = new Scanner(System.in);
        preferredNumber = input.nextInt();

        System.out.print("Enter address name: ");
        String name = input.next();
        System.out.print("Enter full address: ");
        String address = input.next();
        System.out.print("Enter door number");
        int doorNumber = input.nextInt();

        switch (preferredNumber){
            case 1: addresses.add(new HomeAddress(name, address, doorNumber));
            case 2: addresses.add(new BusinessAddress(name, address, doorNumber));
            default:
                System.out.println("Please enter one of the numbers shown above ");
        }
    }



    /*public static void deleteAddress(ArrayList<IAddress> addresses){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter door number that you want to delete");

        int doorNumber = input.nextInt();
        for(IAddress address : addresses){
            if(address.doorNumber = doorNumber){
                address.r
            }
        }
    }*/
}
