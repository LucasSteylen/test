import java.util.Scanner;
//////////////////////////////////////////////////////////////////////////////////////
public class Main {
    public static void main(String[] args) {

        Scanner scr_input = new Scanner (System.in);

        int age = 0;
        String name = "";
        String str_overflow = "";
        String no_entry = "";
        int counter = 0;
        int entry_counter = 0;
        int under_counter = 0;

        System.out.println("30 students allowed ");

    while(counter < 30){
        counter++;
        System.out.print("Enter a name or EXIT: ");
        name = scr_input.nextLine();
        name = name.toUpperCase();

        if(name.equals("EXIT")){
            break;
        }

        System.out.print("Enter your age: ");
        age = scr_input.nextInt();
        str_overflow = scr_input.nextLine();


        if (age >= 18) {
            System.out.print(name + ",");
            System.out.println("\nadult");
            System.out.println("Entry\n");
            entry_counter++;
        }

        else {
            System.out.println(name + ",");
            System.out.println("Under age\n");
            under_counter++;
            no_entry = no_entry + name + ", ";

        }

    }

        System.out.print("\n" + entry_counter + " Persons given entery");
        System.out.print("\n" + under_counter + " Persons denied entery\n\n");
        System.out.print(no_entry + " where not given entry\n");

    }
}