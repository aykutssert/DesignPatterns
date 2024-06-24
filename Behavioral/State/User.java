package State;

import java.util.Scanner;

public class User implements State{
    Program program;    
    public User(Program program) {
        this.program = program;
    }
    @Override
    public void handle() {
        String choiceStr;
        System.out.println("User Page Welcome");
        System.out.println("Service 1");
        System.out.println("Service 2");
        System.out.println("Exit");
        Scanner sc = new Scanner(System.in);
        choiceStr = sc.nextLine();
        int choice = Integer.parseInt(choiceStr);
       
        if(choice == 1) {
            System.out.println("Service 1");

            program.Logout();

        }
        else if(choice == 2) {
            System.out.println("Service 2");
            program.Logout();
        }
        else {
            System.out.println("Exit");
            program.Logout();
        }

    }
    
}
