package homework;

public class UserReporter  extends User implements Reportable{

    public UserReporter(String name) {
        super(name);
    }
    @Override
    public void report() {
            System.out.println("Report for user: " + this.getName());
    }
}
