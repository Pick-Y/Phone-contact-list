import java.util.ArrayList;
import java.util.Scanner;

public class Phone {

    private ArrayList<Contacts> contacts = new ArrayList<>();

    public void addContact(Contacts contact) {

        contacts.add(contact);
        System.out.println("You have added a new contact: " + contact.printContact());
    }

    public void removeContact() {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        int chooseContact = 1;
        System.out.println("Which contact do you want to remove? ");

        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(count++ + " " + contacts.get(i).printContact());
        }
        chooseContact = scanner.nextInt() - 1;
        System.out.println("Contact" + contacts.indexOf(chooseContact));

        contacts.remove(chooseContact);


    }

    public void editContact() {
        int count = 1;
        System.out.println("Which contact do you want to edit? ");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(count++ + " " + contacts.get(i).printContact());
        }

        Scanner scanner = new Scanner(System.in);
        int chooseContactToEdit = scanner.nextInt() - 1;


        for (int i = 0; i < contacts.size(); i++) {


            int position = 0;
            int itemToChange = 0;
            //System.out.println(" hai scelto " + (chooseContactToEdit + 1) + " che corrispone alla posizione:" + contacts.indexOf(contacts.get(chooseContactToEdit)));
            //System.out.println(contacts.get(chooseContactToEdit).getName() + " " + contacts.get(chooseContactToEdit).getNumber());
            position = chooseContactToEdit;

            System.out.println("What information do you want to change?: ");
            System.out.println("1 - Name ");
            System.out.println("2 - Number ");
            System.out.println("3 - both ");
            itemToChange = scanner.nextInt();

            if(itemToChange == 1){
                Scanner newItem = new Scanner(System.in);

                System.out.println("Insert name:");
                String newName = newItem.nextLine();
                contacts.get(position).setName(newName);
            }else if(itemToChange == 2){
                Scanner newItem = new Scanner(System.in);

                System.out.println("Insert number:");
                String newNumber = newItem.nextLine();
                contacts.get(position).setNumber(newNumber);
            }else if(itemToChange == 3){

                Scanner newItem = new Scanner(System.in);

                System.out.println("Insert name:");
                String newName = newItem.nextLine();
                contacts.get(position).setName(newName);

                System.out.println("Insert number:");
                String newNumber = newItem.nextLine();
                contacts.get(position).setNumber(newNumber);

            }
            //now, get the name and number and ask what the user wants to edit
            break;
        }
    }

    public void searchContacts(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a name to search: ");
        String nameToSearch = scanner.nextLine();

        //create a loop to go through the list and check the name.
        for(int i = 0; i < contacts.size(); i++){
            if(!contacts.get(i).getName().contains(nameToSearch)){


            }else {
                System.out.println("Contact found: " + contacts.get(i).printContact());
            }

        }


    }


    public boolean checkListHasContact(){

        if(!contacts.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
    public void printContacts() {

        if (contacts.isEmpty()) {
            System.out.println("Non ci sono contatti da farti vedere");
        } else {

               for(int i = 0; i < contacts.size(); i++){
                   System.out.println(contacts.get(i).printContact());
               }
            }
        }

}
