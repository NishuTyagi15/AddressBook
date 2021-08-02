import java.util.Scanner;


public class AddressBookMain {
	      
	  
	public static void main(String[] args){

	    Scanner S = new Scanner(System.in);
	    System.out.print("How many Address Books you want to Create? : ");
	    int maxEntries;
	    int howManyEntries;

	    AddressBook[] ab = new AddressBook[0];


	    while(true){
        // Enter maximum entries in address book
	        maxEntries = S.nextInt();
	        if (maxEntries>0){
	            ab = new AddressBook[maxEntries];
	            break;
	        }
	        else {
                System.out.print("You must create at least 1 entry.");
	        }
		}

        for (int i=0;i<ab.length;i++){
            ab[i] = new AddressBook(); 

	        while(true){
	            System.out.print("How many Entries you want to create in " +i+ " Address Book : ");
	            howManyEntries = S.nextInt();
	            if (howManyEntries>0) {
	                ab[i].initEntry(howManyEntries);
	                break;
	            }
	            else {
				    System.out.println("You must create at least 1 Entry.");
	            }
            }
	    }
		boolean done = false;
	    int bookSelected = 0;
	    int select;
	    while (done==false){
	        System.out.println("Address Book "+bookSelected+" is Selected Currently.");

	        for (int j = 0; j < ab[bookSelected].getEntry(); j++){
	            System.out.println("===========Entry "+j+" ===========");
	            ab[bookSelected].c[j].readEntries();
	            System.out.println("================================");

	        }
			System.out.println("Select an Option!");
	        System.out.println("1. Add an Entry");
	        System.out.println("2. Edit an Existing Entry");
	        System.out.println("3. Delete an Existing Entry");						
	        System.out.println("4. Exit the Menu");
	        System.out.print("> ");
	        select = S.nextInt();
	        String firstName, lastName, address, city, state, zipCode, phoneNumber, email;
	        switch(select){
	            case 1: 
	                System.out.print("First name? ");
	                firstName = S.next();
	                System.out.print("Last name? ");
	                lastName = S.next();
	                System.out.print("Complete Address? ");
	                address = S.next();
	                System.out.print("City? ");
	                city = S.next();
					System.out.println("State? ");
					state = S.next();
	                System.out.print("Zip Code? ");
	                zipCode = S.next();
	                System.out.print("Phone Number? ");
	                phoneNumber = S.next();
	                System.out.print("E-mail? ");
	                email = S.next();
	                ab[bookSelected].add(firstName, lastName, address, city, 
					                        state, zipCode,phoneNumber, email);
	                break;
	            
				case 2:
				    System.out.print("Select the Entry you want to Edit? ");
				    int selectEntry = S.nextInt();
				    System.out.print("First name? ");
				    firstName = S.next();
				    System.out.print("Last name? ");
				    lastName = S.next();
				    System.out.print("Complete Address? ");
				    address = S.next();
				    System.out.print("City? ");
				    city = S.next();
				    System.out.println("State? ");
				    state = S.next();
				    System.out.print("Zip Code? ");
				    zipCode = S.next();
				    System.out.print("Phone Number? ");
				    phoneNumber = S.next();
				    System.out.print("E-mail? ");
				    email = S.next();
				    ab[bookSelected].edit(firstName, lastName, address, city, 
					                        state, zipCode,phoneNumber, email, selectEntry);
					break;
                case 3:
				    System.out.print("Select the Entry you want to Delete ");
				    int deleteEntry = S.nextInt();
	                ab[bookSelected].delete(deleteEntry);
	                break;

	            case 4:
	                done = true;
	                break;

	            default:
	                System.out.print("Kindly Select a Valid Menu Number!");

			}
		}
    }
}