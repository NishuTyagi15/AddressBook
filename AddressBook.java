import java.util.Scanner;

public class AddressBook{
    Scanner S = new Scanner(System.in);

    //Nested class
    class Entries{
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private String zipCode;
        private String phoneNumber;
        private String email;

        Entries(String firstName, String lastName, String address, String city,
                String state, String zipCode, String phoneNumber, String email){

            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city=city;
            this.state=state;
            this.zipCode=zipCode;
            this.phoneNumber=phoneNumber;
            this.email = email;
        }
        Entries(){
            firstName = "";
            lastName = "";
            address = "";
            city = "";
            state = "";
            zipCode= "";
            phoneNumber = "";
            email = "";
        }

        public void readEntries(){
            System.out.println("First Name:"+firstName );
            System.out.println("Last Name:"+lastName );
            System.out.println("Complete Address:"+address );
            System.out.println("City:"+city );
            System.out.println("State:"+state);
            System.out.println("Zip Code:"+zipCode );
            System.out.println("Phone Number:"+phoneNumber );
            System.out.println("E-mail:"+email );
        }
    }

    // Check How Many Files in Address Book
    private int entries = 0;
    Entries[] c;
    public void initEntry(int b){
        c = new Entries[b];
        for (int i = 0;i<c.length;i++){    
            c[i] = new Entries();
        }
    }
    public int getEntry(){
        return c.length;
    }
    //Adds Entry to the Address Book
    public void add(String firstName, String lastName, String address, String city, 
                        String state, String zip,String phoneNumber, String email){

        if (entries<c.length){

        c[entries] = new Entries (firstName, lastName, address, city, 
                                        state, zip, phoneNumber, email);
        entries++;
        }
        else System.out.println("Error : Address Book is Already Full!");
    }
}