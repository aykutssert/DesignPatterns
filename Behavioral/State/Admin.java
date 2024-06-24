package State;

import java.util.Scanner;

public class Admin implements State{
    Program program;
    public Admin(Program program) {
        this.program = program;
    }
    @Override
    public void handle() {
        String choiceStr;
        System.out.println("Admin Page");
        System.out.println("Add new user");
        System.out.println("Delete user");
        System.out.println("Exit");
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        choiceStr = sc.nextLine();
        int choice = Integer.parseInt(choiceStr);
        
        if(choice == 1) {
            System.out.println("Add new user");
            program.Logout();
        }
        else if(choice == 2) {
            System.out.println("Delete user");
            program.Logout();
        }
        else {
            System.out.println("Exit");
            program.Logout();
        }

    }
    
}
