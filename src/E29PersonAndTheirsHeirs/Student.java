package E29PersonAndTheirsHeirs;

public class Student extends Person {

    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " - credits: " + getCredits();
    }

    public int getCredits() {
        return credits;
    }

    public void study(){
        this.credits += 1;
    }

}
