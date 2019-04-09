package E29PersonAndTheirsHeirs;

public class Teacher extends Person {

    private int salary;

    public Teacher(String name, String address, int salary){
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " - " +  getSalary() + " euros/month" ;
    }

    public int getSalary() {
        return salary;
    }
}
