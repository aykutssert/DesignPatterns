package State;

import java.util.Scanner;

public class UndefineState implements State{
    Program program;
    public UndefineState(Program program) {
        this.program = program;
    }
    @Override
    public void handle() {
        String choiceStr;
        System.out.println("1. New User");
        System.out.println("2. Login");
        System.out.println("3. Admin");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        choiceStr = sc.nextLine();
        int choice = Integer.parseInt(choiceStr);
        
        if(choice == 1) {
          
            program.Login();
        }
        else if(choice == 2) {
           
            program.Login();
        }
        else if(choice == 3) {
           
            program.Admin();
        }
        else {
           
            program.Logout();
        }
       

    }
    
}