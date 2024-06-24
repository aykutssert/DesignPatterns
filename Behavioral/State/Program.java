package State;

public class Program {
    private State state;
    public Program() {
        state = new UndefineState(this);
    }
    public void run() {
        
        state.handle();
    }
    public void Login() {
        state = new User(this);
        run();
    }
    public void Admin() {
        state = new Admin(this);
        run();
    }
    public void Logout() {
        state = new UndefineState(this);
        run();
    }
    
}
