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
                        String state, String zip, String phoneNumber, String email){

        if (entries<c.length){

        c[entries] = new Entries (firstName, lastName, address, city, 
                                        state, zip, phoneNumber, email);
        entries++;
        }
        else System.out.println("Error : Address Book is Already Full!");
    }

    // Edit an Existing Entry from Address Book
    public void edit(String firstName, String lastName, String address, String city, String state, 
                        String zipCode, String phoneNumber, String email, int select){
        c[select].firstName = firstName;
        c[select].lastName = lastName;
        c[select].address = address;
        c[select].city = city;
        c[select].state = state;
        c[select].zipCode = zipCode;
        c[select].phoneNumber = phoneNumber;
        c[select].email = email;
    }
    
    // Removes an Existing Entry from the Address Book
    public void delete(int deleteEntry){
        if (entries>=0){
            c[deleteEntry] = new Entries();
            for (int j = 0; j<entries-deleteEntry; j++){
                if (deleteEntry+1==entries) c[deleteEntry] = new Entries();
                else{
                    Entries temp = c[deleteEntry+j];
                    c[deleteEntry+j] = c[deleteEntry+j+1];
                    c[deleteEntry+j+1] = temp;
                }
            }
            entries--;
        }
        else {
                System.out.println("Error : The Address Book is Empty. Please Add First!");
        }
    }
}