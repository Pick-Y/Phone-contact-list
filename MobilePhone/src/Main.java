import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Contacts contact = new Contacts("Alessandro","0426977114");

        Phone AlessandrosPhone = new Phone();


        boolean quit = false;
        while (!quit){
            Scanner sc = new Scanner(System.in);
            System.out.println("CONTACT LIST");


                System.out.println("Select an option:");
                System.out.println("1 - Add contact");
                System.out.println("2 - Remove contact");
                System.out.println("3 - Edit contact");
                System.out.println("4 - Search contact");


            int newChoice = sc.nextInt();


            switch (newChoice){

                case 1:

                    boolean choice1 = true;
                    while(choice1){
                        Scanner scanner = new Scanner(System.in);

                        System.out.println("Insert a name:");
                        String name = scanner.nextLine();

                        System.out.println("Insert a number:");
                        String number = scanner.nextLine();

                        Contacts newContact = new Contacts(name,number);
                        AlessandrosPhone.addContact(newContact);

                        System.out.println("Do you want to add another contact? y/n");

                        String answer = scanner.nextLine();
                        if(answer.matches("y")){
                            choice1 = true;
                            continue;
                        }else {

                            System.out.println("Do you want to stop adding Contacts?y/n");
                            String close = scanner.nextLine();
                            if(close.matches("y")){

                                choice1 = false;
                                break;
                            }else{
                                choice1 = true;
                            }

                        }
                    }
                    break;
                case 2:
                    AlessandrosPhone.removeContact();
                    break;
                case 3:
                    AlessandrosPhone.editContact();
                    break;
                case 4:
                    AlessandrosPhone.searchContacts();

            }


        }



    }
}
